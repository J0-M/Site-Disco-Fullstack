import './ProductGrid.css'
import { ProductCard } from '../components/ProductCard'
import { useProductData } from '../hooks/useData/useProductData'

function ProductGrid() {

  const {data = []} = useProductData();

  return (
    <>  
      <div className="container">
        <h1>Produtos:</h1>
        <div className="productGrid">

          {data?.map(productData => 
            <ProductCard
              key={productData.id}
              id = {productData.id || ''}
              image = {productData.image}
              name = {productData.name}
              description = {productData.description}
              price = {productData.price}
              bands = {productData.bands}
              category = {productData.category}
            />
          )}
        </div>
      </div>
    </>
  )
}

export default ProductGrid
