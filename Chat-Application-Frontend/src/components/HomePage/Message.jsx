import React from "react";

const Message = ({ isReqUserMessage, content, messageRef}) => {
  return (
    <div
      ref={messageRef}
      className={`py-2 px-2 rounded-t-xl max-w-[50%]  ${isReqUserMessage ? "rounded-bl-none rounded-br-xl self-start bg-[#C7C7C7]  " : "rounded-bl-xl rounded-br-none self-end text-white bg-[#FF4A09] " }`}
    >
      
    <p className="text-sm">{content}</p>
    </div>
  );
};

export default Message;
