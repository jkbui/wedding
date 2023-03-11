import React, { ReactElement } from "react";
import { Link, Path } from "react-router-dom";
interface TabProps {
  title: String;
  url: any;
}
export const Tab = ({ title, url }: TabProps): ReactElement => {
  return (
    <>
      <Link to={url}>
        <h2>{title}</h2>
      </Link>
    </>
  );
};
