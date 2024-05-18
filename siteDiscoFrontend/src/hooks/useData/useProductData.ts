import axios, { AxiosPromise } from "axios";
import { ProductData } from "../../interface/ProductData";
import { useQuery } from "@tanstack/react-query";

const API_URL = 'http://localhost:8081';

const fecthData = async(): AxiosPromise<ProductData[]> => {
    const response = await axios.get(API_URL + '/product');

    return response;
}

export function useProductData(){
    const query = useQuery({
        queryFn: fecthData,
        queryKey: ['product-data'],
        retry: 2
    });

    return{
        ...query,
        data: query.data?.data
    }
}