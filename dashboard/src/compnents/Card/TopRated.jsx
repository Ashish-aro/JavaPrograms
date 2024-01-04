import React from "react";
import image from "../../assets/images/Laptop.png";

export default function TopRated(Props) {
  return (
    <div className="pb-10">
      <div className="flex justify-start items-center w-[380px] rounded-xl border border-black bg-white">
        <div className="">
          <img
            className="h-[138px] w-[160px] rounded-l-xl"
            src={Props.rated.images[0]}
            alt=""
          />
        </div>
        <div className="p-5">
          <p className="p-1 text-[16px]">{Props.rated.title}</p>
          <p className="p-1 font-bold text-[16px]">${Props.rated.price}</p>
          <div className="p-1 text-[14px]">
            <i className="fa fa-star text-[#ff8a00] p-1"></i>
            <i className="fa fa-star text-[#ff8a00] p-1"></i>
            <i className="fa fa-star text-[#ff8a00] p-1"></i>
            <i className="fa fa-star text-[#ff8a00] p-1"></i>
            <i className="fa fa-star text-[#cccccc] p-1"></i>
          </div>
        </div>
      </div>
    </div>
  );
}
