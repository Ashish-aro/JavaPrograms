import React from "react";
import image from "../../assets/images/Laptop.png";

export default function CategoryCard(Props) {
  return (
    <div className="pt-10">
      <div className="rounded-2xl border border-[#a5a8a6] w-[200px] h-[220px]">
        <div className="rounded-2xl p-3">
          <img
            className="w-[180px] h-[140px]"
            src={Props.category.images[0]}
            alt=""
          />
        </div>
        <div className="text-center">
          <span className="text-[14px] font-bold">{Props.category.title}</span>
        </div>
      </div>
    </div>
  );
}
