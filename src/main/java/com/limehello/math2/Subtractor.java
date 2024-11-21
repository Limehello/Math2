package com.limehello.math2;

import java.util.ArrayList;
import java.util.List;

public class Subtractor {
 private Subtractor() {}
 public static int subtract(int a, int b){
  return a-b;
 }
 public static int subtractInt(int a, int b){
  return a-b;
 }
 public static double subtract(double a, double b) {
  return a-b;
 }
 public static double subtractDouble(double a, double b) {
  return a-b;
 }
 public static float subtract(float a, float b) {
  return a-b;
 }
 public static float subtractFloat(float a, float b) {
  return a-b;
 }
 public static short subtract(short a, short b) {
  return (short)(a-b);
 }
 public static short subtractShort(short a, short b) {
  return (short)(a-b);
 }
 public static long subtract(long a, long b) {
  return a-b;
 }
 public static long subtractLong(long a, long b) {
  return a-b;
 }
 public static byte subtract(byte a, byte b) {
  return (byte)(a-b);
 }
 public static byte subtractByte(byte a, byte b) {
  return (byte)(a-b);
 }
 public static int subtract(int... n){
  int result = 0;
  boolean isFirst = true;
  for (int a : n) {
   if (isFirst) {
    result = a;
    isFirst = false;
   } else {
    result -= a;
   }
  }
  return result;
 }
 public static int subtractInt(int... n){
  int result = 0;
  boolean isFirst = true;
  for (int a : n) {
   if (isFirst) {
    result = a;
    isFirst = false;
   } else {
    result -= a;
   }
  }
  return result;
 }
 public static double subtract(double... n){
  double result = 0;
  boolean isFirst = true;
  for (double a : n) {
   if (isFirst) {
    result = a;
    isFirst = false;
   } else {
    result -= a;
   }
  }
  return result;
 }
 public static double subtractDouble(double... n){
  double result = 0;
  boolean isFirst = true;
  for (double a : n) {
   if (isFirst) {
    result = a;
    isFirst = false;
   } else {
    result -= a;
   }
  }
  return result;
 }
 public static float subtract(float... n){
  float result = 0;
  boolean isFirst = true;
  for (float a : n) {
   if (isFirst) {
    result = a;
    isFirst = false;
   } else {
    result -= a;
   }
  }
  return result;
 }
 public static float subtractFloat(float... n){
  float result = 0;
  boolean isFirst = true;
  for (float a : n) {
   if (isFirst) {
    result = a;
    isFirst = false;
   } else {
    result -= a;
   }
  }
  return result;
 }
 public static short subtract(short... n){
  short result = 0;
  boolean isFirst = true;
  for (short a : n) {
   if (isFirst) {
    result = a;
    isFirst = false;
   } else {
    result -= a;
   }
  }
  return result;
 }
 public static short subtractShort(short... n){
  short result = 0;
  boolean isFirst = true;
  for (short a : n) {
   if (isFirst) {
    result = a;
    isFirst = false;
   } else {
    result -= a;
   }
  }
  return result;
 }
 public static long subtract(long... n){
  long result = 0;
  boolean isFirst = true;
  for (long a : n) {
   if (isFirst) {
    result = a;
    isFirst = false;
   } else {
    result -= a;
   }
  }
  return result;
 }
 public static long subtractLong(long... n){
  long result = 0;
  boolean isFirst = true;
  for (long a : n) {
   if (isFirst) {
    result = a;
    isFirst = false;
   } else {
    result -= a;
   }
  }
  return result;
 }
 public static byte subtract(byte... n){
  byte result = 0;
  boolean isFirst = true;
  for (byte a : n) {
   if (isFirst) {
    result = a;
    isFirst = false;
   } else {
    result -= a;
   }
  }
  return result;
 }
 public static byte subtractByte(byte... n){
  byte result = 0;
  boolean isFirst = true;
  for (byte a : n) {
   if (isFirst) {
    result = a;
    isFirst = false;
   } else {
    result -= a;
   }
  }
  return result;
 }
 public static int subtractInt(List<Integer> n){
  int result = 0;
  boolean isFirst = true;
  for (int a : n) {
   if (isFirst) {
    result = a;
    isFirst = false;
   } else {
    result -= a;
   }
  }
  return result;
 }
 public static double subtractDouble(List<Double> n){
  double result = 0;
  boolean isFirst = true;
  for (double a : n) {
   if (isFirst) {
    result = a;
    isFirst = false;
   } else {
    result -= a;
   }
  }
  return result;
 }
 public static float subtractFloat(List<Float> n){
  float result = 0;
  boolean isFirst = true;
  for (float a : n) {
   if (isFirst) {
    result = a;
    isFirst = false;
   } else {
    result -= a;
   }
  }
  return result;
 }
 public static short subtractShort(List<Short> n){
  short result = 0;
  boolean isFirst = true;
  for (short a : n) {
   if (isFirst) {
    result = a;
    isFirst = false;
   } else {
    result -= a;
   }
  }
  return result;
 }
 public static long subtractLong(List<Long> n){
  long result = 0;
  boolean isFirst = true;
  for (long a : n) {
   if (isFirst) {
    result = a;
    isFirst = false;
   } else {
    result -= a;
   }
  }
  return result;
 }
 public static byte subtractByte(List<Byte> n){
  byte result = 0;
  boolean isFirst = true;
  for (byte a : n) {
   if (isFirst) {
    result = a;
    isFirst = false;
   } else {
    result -= a;
   }
  }
  return result;
 }
 public static int[] subtractInt(int[] a, int[] b) {
  List<Integer> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add(((i < a.length) ? a[i] : 0) - ((i < b.length) ? b[i] : 0));
  }
  int[] resultArray = new int[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static double[] subtractDouble(double[] a, double[] b) {
  List<Double> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add(((i < a.length) ? a[i] : 0) - ((i < b.length) ? b[i] : 0));
  }
  double[] resultArray = new double[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static float[] subtractFloat(float[] a, float[] b) {
  List<Float> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add(((i < a.length) ? a[i] : 0) - ((i < b.length) ? b[i] : 0));
  }
  float[] resultArray = new float[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static short[] subtractShort(short[] a, short[] b) {
  List<Short> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add((short)(((i < a.length) ? a[i] : 0) - ((i < b.length) ? b[i] : 0)));
  }
  short[] resultArray = new short[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static long[] subtractLong(long[] a, long[] b) {
  List<Long> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add((long)(((i < a.length) ? a[i] : 0) - ((i < b.length) ? b[i] : 0)));
  }
  long[] resultArray = new long[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static byte[] subtractByte(byte[] a, byte[] b) {
  List<Byte> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add((byte)(((i < a.length) ? a[i] : 0) - ((i < b.length) ? b[i] : 0)));
  }
  byte[] resultArray = new byte[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static List<Integer> subtractInt(List<Integer> a, List<Integer> b) {
  List<Integer> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add(((i < a.size()) ? a.get(i) : 0) - ((i < b.size()) ? b.get(i) : 0));
  }
  return result;
 }
 public static List<Double> subtractDouble(List<Double> a, List<Double> b) {
  List<Double> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add(((i < a.size()) ? a.get(i) : 0) - ((i < b.size()) ? b.get(i) : 0));
  }
  return result;
 }
 public static List<Short> subtractShort(List<Short> a, List<Short> b) {
  List<Short> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add((short)(((i < a.size()) ? a.get(i) : 0) - ((i < b.size()) ? b.get(i) : 0)));
  }
  return result;
 }
 public static List<Float> subtractFloat(List<Float> a, List<Float> b) {
  List<Float> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add((float)(((i < a.size()) ? a.get(i) : 0) - ((i < b.size()) ? b.get(i) : 0)));
  }
  return result;
 }
 public static List<Long> subtractLong(List<Long> a, List<Long> b) {
  List<Long> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add(((i < a.size()) ? a.get(i) : 0) - ((i < b.size()) ? b.get(i) : 0));
  }
  return result;
 }
 public static List<Byte> subtractByte(List<Byte> a, List<Byte> b) {
  List<Byte> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add((byte)(((i < a.size()) ? a.get(i) : 0) - ((i < b.size()) ? b.get(i) : 0)));
  }
  return result;
 }
 public static int[] subtractInt(int a, int[] b) {
  List<Integer> result = new ArrayList<>();
  for (int i : b) {
   result.add(i - a);
  }
  int[] resultArray = new int[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static double[] subtractDouble(double a, double[] b) {
  List<Double> result = new ArrayList<>();
  for (double i : b) {
   result.add(i - a);
  }
  double[] resultArray = new double[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static float[] subtractFloat(float a, float[] b) {
  List<Float> result = new ArrayList<>();
  for (float i : b) {
   result.add(i - a);
  }
  float[] resultArray = new float[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static short[] subtractShort(short a, short[] b) {
  List<Short> result = new ArrayList<>();
  for (short i : b) {
   result.add((short)(i - a));
  }
  short[] resultArray = new short[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static long[] subtractLong(long a, long[] b) {
  List<Long> result = new ArrayList<>();
  for (long i : b) {
   result.add(i - a);
  }
  long[] resultArray = new long[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static byte[] subtractByte(byte a, byte[] b) {
  List<Byte> result = new ArrayList<>();
  for (byte i : b) {
   result.add((byte)(i - a));
  }
  byte[] resultArray = new byte[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static List<Integer> subtractInt(int a, List<Integer> b) {
  List<Integer> result = new ArrayList<>();
  for (int i : b) {
   result.add(i - a);
  }
  return result;
 }
 public static List<Double> subtractDouble(double a, List<Double> b) {
  List<Double> result = new ArrayList<>();
  for (double i : b) {
   result.add(i - a);
  }
  return result;
 }
 public static List<Float> subtractFloat(float a, List<Float> b) {
  List<Float> result = new ArrayList<>();
  for (float i : b) {
   result.add(i - a);
  }
  return result;
 }
 public static List<Short> subtractShort(short a, List<Short> b) {
  List<Short> result = new ArrayList<>();
  for (short i : b) {
   result.add((short)(i - a));
  }
  return result;
 }
 public static List<Long> subtractLong(long a, List<Long> b) {
  List<Long> result = new ArrayList<>();
  for (long i : b) {
   result.add(i - a);
  }
  return result;
 }
 public static List<Byte> subtractByte(byte a, List<Byte> b) {
  List<Byte> result = new ArrayList<>();
  for (byte i : b) {
   result.add((byte)(i - a));
  }
  return result;
 }
}