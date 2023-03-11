import React, { ReactElement } from "react";

interface TabProps {
  title: String;
}
export const Tab = ({ title }: TabProps): ReactElement => {
  return (
    <>
      <button>{title}</button>
    </>
  );
};
