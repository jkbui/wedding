import React, { ReactElement } from "react";
import { Tab } from "./Tab.tsx";

export const Tabs = (): ReactElement => {
  return (
    <>
      <Tab title="Hjem" />
      <Tab title="Når" />
      <Tab title="Hvor" />
      <Tab title="Kommentarer" />
    </>
  );
};
