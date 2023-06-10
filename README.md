# reactcomponets
echo "# reactcomponets" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Gk49107/reactcomponets.git
git push -u origin main

//code for carousal
import "react-responsive-carousel/lib/styles/carousel.min.css"; // requires a loader
import { Carousel } from 'react-responsive-carousel';

import React from 'react'

export default function Caursol() {
  return (
    <Carousel autoPlay='true' interval={2000} infiniteLoop='true'>
    <div>
        <img src="https://img.freepik.com/free-vector/yellow-diwali-banner-with-text-space_1017-33948.jpg?w=826&t=st=1686397982~exp=1686398582~hmac=fc21e9b9fe8e6141595821a964614d9482aa6fe7a03d303f1c329d3ad41446fe" />
        
    </div>

</Carousel>
  )
}
