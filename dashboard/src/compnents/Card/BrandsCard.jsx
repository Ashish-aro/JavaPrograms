import React from 'react'
import image from '../../assets/images/Laptop.png'

export default function BrandsCard(Props) {
  return (
    <div>
      <div className=''>
        <img className="h-[160px] w-[160px]" src={Props.brands.images[0]} alt="" />
      </div>
    </div>
  )
}
