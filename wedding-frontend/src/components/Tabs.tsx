import React, { ReactElement } from "react";
import { Tab } from "./Tab";
import { Link } from "react-router-dom";

export const Tabs = (): ReactElement => {
  return (
    <>
      <Tab title="Hjem" url='/' />
      <Tab title="Når" url='/when' />
      <Tab title="Hvor" url='/where' />
      <Tab title="Kommentarer" url='/comments' />
    </>
  );
};
