import React, { ReactElement } from "react";
import { useState, useEffect } from "react";

export const Timer = (): ReactElement => {
  const [days, setDays] = useState(0);
  const [hours, setHours] = useState(0);
  const [minutes, setMinutes] = useState(0);
  const [seconds, setSeconds] = useState(0);

  const weddingDateTime = "December, 31, 2023";

  const getTime = () => {
    const remainingTIme = Date.parse(weddingDateTime) - Date.now();

    setDays(Math.floor(remainingTIme / (1000 * 60 * 60 * 24)));
    setHours(Math.floor((remainingTIme / (100 * 60 * 60)) % 24));
    setMinutes(Math.floor((remainingTIme / 1000 / 60) % 60));
    setSeconds(Math.floor((remainingTIme / 1000) % 60));
  };

  useEffect(() => {
    const interval = setInterval(() => getTime(), 1000);

    return () => clearInterval(interval);
  }, []);

  return (
    <>
      <h1>Timer1</h1>
      {days} days, {hours} hours, {minutes} minutes, and {seconds} seconds.
      <h1>Timer</h1>
    </>
  );
};
