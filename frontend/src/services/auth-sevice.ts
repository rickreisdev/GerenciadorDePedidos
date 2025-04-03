"use client";
import axios from 'axios';

const API_URL = process.env.NEXT_PUBLIC_API_URL || 'http://localhost:8080/api';

interface LoginResponse {
    token: string;
    user: {
        id: number;
        name: string;
        email: string;
        role: string;
    }
}

export async function loginUser(email: string, password: string): Promise<LoginResponse> {
    try {
        const response = await axios.post(`${API_URL}/auth/login`, {
            email,
            password
        });

        return response.data;
    } catch (error) {
        if (axios.isAxiosError(error) && error.response) {
            throw new Error(error.response.data.message || 'Falha na autenticação');
        }
        throw new Error('Erro ao conectar com o servidor. Tente novamente mais tarde.');
    }
}

export async function validateToken(token: string): Promise<boolean> {
    try {
        const response = await axios.get(`${API_URL}/auth/validate`, {
            headers: {
                Authorization: `Bearer ${token}`
            }
        });

        return response.status === 200;
    } catch (error) {
        console.log(error)
        return false;
    }
}

export async function logoutUser(): Promise<void> {
    localStorage.removeItem('authToken');
}

export function getAuthToken(): string | null {
    if (typeof window !== 'undefined') {
        return localStorage.getItem('authToken');
    }
    return null;
}

export function isAuthenticated(): boolean {
    const token = getAuthToken();
    return !!token;
}