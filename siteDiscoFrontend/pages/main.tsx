import React from 'react'
import ReactDOM from 'react-dom/client'
import ProductGrid from '../src/Apps/ProductGrid'
import './index.css'
import { QueryClient, QueryClientProvider } from '@tanstack/react-query'

const queryClient = new QueryClient();

ReactDOM.createRoot(document.getElementById('root')!).render(
  <React.StrictMode>
    <QueryClientProvider client={queryClient}>{/*configuração necessária do react query para funcionar, necessário para consumir adequadamente a API*/}
      <ProductGrid />
    </QueryClientProvider>
  </React.StrictMode>,
)
