import './card.css'

interface CardProps{
    id: string,
    name: string,
    image: string,
    description: string,
    price: number,
    bands: string[],
    category: string
}

export function ProductCard( {name, image, description, price, bands, category} : CardProps){
    return(
        <div className="card">
            <img src={image}/>
            <h2>{name}</h2>
            <p>{description}</p>
            <p>Price: <b>${price}</b></p>
            <p>Bands: <b>{bands.join(', ')}</b></p>
            <p>Category: <b>{category}</b></p>
        </div>
    )
}