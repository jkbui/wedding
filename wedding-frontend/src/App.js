import React, { Component } from "react";
import "./App.css";
import { Tab } from "./components/Tab.tsx";
import { Tabs } from "./components/Tabs.tsx";
import { createBrowserRouter, RouterProvider } from "react-router-dom";
import { HomePage } from "./pages/HomePage";
import { WherePage } from "./pages/WherePage";
import { WhenPage } from "./pages/WhenPage";
import { CommentPage } from "./pages/CommentPage";

const router = createBrowserRouter([
  { path: "/", element: <HomePage /> },
  { path: "/where", element: <WherePage /> },
  { path: "/when", element: <WhenPage /> },
  { path: "/comments", element: <CommentPage /> },
]);

function App() {
  return <RouterProvider router={router} />;
}

export default App;
