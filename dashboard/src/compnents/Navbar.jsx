import React from "react";

export default function Navbar() {
  return (
    <div>
      <div>
        <div className="flex justify-between items-center text-sm border-b-2 ">
          <div className="ml-10">
            <i className="fa fa-location-dot"></i> 3517 W. Gray St. Utica,
            Pennsylvania 57867
          </div>
          <div className="flex mr-10">
            <ul className="flex justify-evenly">
              <li className="p-2">Eng</li>
              <li className="p-2 border-r-2">USD</li>
              <li className="p-2">Sign In/ Sign Up</li>
            </ul>
          </div>
        </div>

        <div className="flex">
          <div className="w-[30%]"></div>
          <div className="p-6 flex justify-center w-[40%]">
            <input
              className="border p-2 rounded-tl rounded-bl w-[450px]"
              placeholder="Search"
              type="text"
            />
            <button className="bg-[#0c3b73] p-1 w-[110px] rounded-tr rounded-br text-white">
              Search
            </button>
          </div>
          <div className="flex justify-center items-center text-xl w-[30%]">
            <i className="fa fa-phone"></i> &#160; (219) &#160;555-0114
          </div>
        </div>

        <div className="flex justify-between items-center text-white bg-[#191919] h-[60px]">
          <div className="h-[60px] w-full">
            <ul className="flex justify-start items-center">
              <li className="bg-[#0B3B72] h-[60px] w-[60px] flex justify-center items-center">
                <i className="fa fa-bars text-[25px]"></i>
              </li>
              <li className="pl-7">All Categories</li>
              <li className="pl-7">Home</li>
              <li className="pl-7">All Brands</li>
              <li className="pl-7">Discounted Products</li>
              <li className="pl-7">Sellers Zone</li>
              <li className="pl-7">All Seller</li>
              <li className="pl-7">Offer Zone</li>
            </ul>
          </div>
          <div className="flex">
            <ul className="flex justify-evenly text-xl mr-10">
              <li className="p-3">
                <i className="fa-regular fa-heart "></i>
              </li>
              <li className="p-3">
                <i className="fa fa-shopping-bag "></i>
              </li>
              <li className="p-3 rounded">
                <i className="fa-regular fa-user "></i>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  );
}
