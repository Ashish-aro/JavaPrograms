import React from "react";
import Slider from "react-slick";
import "slick-carousel/slick/slick.css";
import "slick-carousel/slick/slick-theme.css";
import Laptop from "../../assets/images/Laptop.png";

export default function HomePageSlider() {
  var settings = {
    dots: true,
    infinite: true,
    speed: 500,
    slidesToShow: 1,
    slidesToScroll: 1,
  };
  return (
    <div>
      <div>
        <Slider {...settings}>
          <div className="">
            <div className="flex text-start bg-[#edf2ee]">
              <div className="w-1/2">
                <img className="w-full" src={Laptop} alt="" />
              </div>
              <div className="w-1/2 p-9">
                <h6 className="text-[#0b3b72]">Welcome 6Valley</h6>
                <p
                  className="text-[72px] font-bold py-1"
                  // style={{ lineHeight: "4rem" }}
                >
                  Power Meet Elegent Design.
                </p>
                <h1 className="text-[36px] font-semibold">
                  Sale up to <span className="text-[#0b3b72]">30% OFF</span>
                </h1>
                <p>Free shipping on all your order. we deliver, you enjoy</p>
                <br />
                <button className="bg-[#0b3b72] text-white p-4 tracking-wide rounded-full ">
                  Buy now &#160; <i className="fa fa-long-arrow-right"></i>
                </button>
              </div>
            </div>
          </div>

          <div>
            <div className="flex text-start">
              <div className="w-1/2">
                <img className="w-full" src={Laptop} alt="" />
              </div>
              <div className="w-1/2 p-9">
                <h6 className="text-[#0b3b72]">Welcome 6Valley</h6>
                <p
                  className="text-[72px] font-bold py-1"
                  // style={{ lineHeight: "4rem" }}
                >
                  Power Meet Elegent Design.
                </p>
                <h3>
                  Sale up to <span className="text-[#0b3b72]">30% OFF</span>
                </h3>
                <p>Free shipping on all your order. we deliver, you enjoy</p>
                <br />
                <button className="bg-[#0b3b72] text-white p-4 tracking-wide rounded-full ">
                  Buy now &#160; <i className="fa fa-long-arrow-right"></i>
                </button>
              </div>
            </div>
          </div>
          <div className="">
          <div className="flex text-start ">
              <div className="w-1/2">
                <img className="w-full" src={Laptop} alt="" />
              </div>
              <div className="w-1/2 p-9">
                <h6 className="text-[#0b3b72]">Welcome 6Valley</h6>
                <p
                  className="text-[72px] font-bold py-1"
                  // style={{ lineHeight: "4rem" }}
                >
                  Power Meet Elegent Design.
                </p>
                <h3>
                  Sale up to <span className="text-[#0b3b72]">30% OFF</span>
                </h3>
                <p>Free shipping on all your order. we deliver, you enjoy</p>
                <br />
                <button className="bg-[#0b3b72] text-white p-4 tracking-wide rounded-full ">
                  Buy now &#160; <i className="fa fa-long-arrow-right"></i>
                </button>
              </div>
            </div>
          </div>
        </Slider>
      </div>
    </div>
  );
}
