import React from "react";
import image from "../../assets/images/Laptop.png";

export default function FeaturedCard(Props) {
  return (
    <div className="p-10">
      <div className="w-[260px] bg-[white] rounded-2xl p-3">
        <div className="">
          <img
            className="h-[220px] rounded-t-2xl"
            src={Props.featured.images[0]}
            alt=""
          />
        </div>
        <div className="font-bold">
          <p className="text-[13px]">{Props.featured.title}</p>
          <div className="flex justify-between items-center mt-2 px-1">
            <div className="text-[12px]">
              <i className="fa fa-star text-[#ff8a00]"></i>{" "}
              <span>{Props.featured.rating}</span>
            </div>
            <div>
              <span>${Props.featured.price}</span>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}
