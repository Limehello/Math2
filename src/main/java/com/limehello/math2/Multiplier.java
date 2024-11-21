package com.limehello.math2;

import java.util.ArrayList;
import java.util.List;

public class Multiplier {
 private Multiplier() {}
 public static int multiply(int a, int b){
  return a*b;
 }
 public static int multiplyInt(int a, int b){
  return a*b;
 }
 public static double multiply(double a, double b) {
  return a*b;
 }
 public static double multiplyDouble(double a, double b) {
  return a*b;
 }
 public static float multiply(float a, float b) {
  return a*b;
 }
 public static float multiplyFloat(float a, float b) {
  return a*b;
 }
 public static short multiply(short a, short b) {
  return (short)(a*b);
 }
 public static short multiplyShort(short a, short b) {
  return (short)(a*b);
 }
 public static long multiply(long a, long b) {
  return a*b;
 }
 public static long multiplyLong(long a, long b) {
  return a*b;
 }
 public static byte multiply(byte a, byte b) {
  return (byte)(a*b);
 }
 public static byte multiplyByte(byte a, byte b) {
  return (byte)(a*b);
 }
 public static int multiply(int... n){
  int result = 1;
  for (int a : n) {
   result *= a;
  }
  return result;
 }
 public static int multiplyInt(int... n){
  int result = 1;
  for (int a : n) {
   result *= a;
  }
  return result;
 }
 public static double multiply(double... n){
  double result = 1;
  for (double a : n) {
   result *= a;
  }
  return result;
 }
 public static double multiplyDouble(double... n){
  double result = 1;
  for (double a : n) {
   result *= a;
  }
  return result;
 }
 public static float multiply(float... n){
  float result = 1;
  for (float a : n) {
   result *= a;
  }
  return result;
 }
 public static float multiplyFloat(float... n){
  float result = 1;
  for (float a : n) {
   result *= a;
  }
  return result;
 }
 public static short multiply(short... n){
  short result = 1;
  for (short a : n) {
   result *= a;
  }
  return result;
 }
 public static short multiplyShort(short... n){
  short result = 1;
  for (short a : n) {
   result *= a;
  }
  return result;
 }
 public static long multiply(long... n){
  long result = 1;
  for (long a : n) {
   result *= a;
  }
  return result;
 }
 public static long multiplyLong(long... n){
  long result = 1;
  for (long a : n) {
   result *= a;
  }
  return result;
 }
 public static byte multiply(byte... n){
  byte result = 1;
  for (byte a : n) {
   result *= a;
  }
  return result;
 }
 public static byte multiplyByte(byte... n){
  byte result = 1;
  for (byte a : n) {
   result *= a;
  }
  return result;
 }
 public static int multiplyInt(List<Integer> n){
  int result = 1;
  for (int a : n) {
   result *= a;
  }
  return result;
 }
 public static double multiplyDouble(List<Double> n){
  double result = 1;
  for (double a : n) {
   result *= a;
  }
  return result;
 }
 public static float multiplyFloat(List<Float> n){
  float result = 1;
  for (float a : n) {
   result *= a;
  }
  return result;
 }
 public static short multiplyShort(List<Short> n){
  short result = 1;
  for (short a : n) {
   result *= a;
  }
  return result;
 }
 public static long multiplyLong(List<Long> n){
  long result = 1;
  for (long a : n) {
   result *= a;
  }
  return result;
 }
 public static byte multiplyByte(List<Byte> n){
  byte result = 1;
  for (byte a : n) {
   result *= a;
  }
  return result;
 }
 public static int[] multiplyInt(int[] a, int[] b) {
  List<Integer> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add(((i < a.length) ? a[i] : 0) * ((i < b.length) ? b[i] : 0));
  }
  int[] resultArray = new int[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static double[] multiplyDouble(double[] a, double[] b) {
  List<Double> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add(((i < a.length) ? a[i] : 0) * ((i < b.length) ? b[i] : 0));
  }
  double[] resultArray = new double[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static float[] multiplyFloat(float[] a, float[] b) {
  List<Float> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add(((i < a.length) ? a[i] : 0) * ((i < b.length) ? b[i] : 0));
  }
  float[] resultArray = new float[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static short[] multiplyShort(short[] a, short[] b) {
  List<Short> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add((short)(((i < a.length) ? a[i] : 0) * ((i < b.length) ? b[i] : 0)));
  }
  short[] resultArray = new short[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static long[] multiplyLong(long[] a, long[] b) {
  List<Long> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add((long)(((i < a.length) ? a[i] : 0) * ((i < b.length) ? b[i] : 0)));
  }
  long[] resultArray = new long[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static byte[] multiplyByte(byte[] a, byte[] b) {
  List<Byte> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add((byte)(((i < a.length) ? a[i] : 0) * ((i < b.length) ? b[i] : 0)));
  }
  byte[] resultArray = new byte[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static List<Integer> multiplyInt(List<Integer> a, List<Integer> b) {
  List<Integer> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add(((i < a.size()) ? a.get(i) : 0) * ((i < b.size()) ? b.get(i) : 0));
  }
  return result;
 }
 public static List<Double> multiplyDouble(List<Double> a, List<Double> b) {
  List<Double> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add(((i < a.size()) ? a.get(i) : 0) * ((i < b.size()) ? b.get(i) : 0));
  }
  return result;
 }
 public static List<Short> multiplyShort(List<Short> a, List<Short> b) {
  List<Short> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add((short)(((i < a.size()) ? a.get(i) : 0) * ((i < b.size()) ? b.get(i) : 0)));
  }
  return result;
 }
 public static List<Float> multiplyFloat(List<Float> a, List<Float> b) {
  List<Float> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add((float)(((i < a.size()) ? a.get(i) : 0) * ((i < b.size()) ? b.get(i) : 0)));
  }
  return result;
 }
 public static List<Long> multiplyLong(List<Long> a, List<Long> b) {
  List<Long> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add(((i < a.size()) ? a.get(i) : 0) * ((i < b.size()) ? b.get(i) : 0));
  }
  return result;
 }
 public static List<Byte> multiplyByte(List<Byte> a, List<Byte> b) {
  List<Byte> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add((byte)(((i < a.size()) ? a.get(i) : 0) + ((i < b.size()) ? b.get(i) : 0)));
  }
  return result;
 }
 public static int[] multiplyInt(int a, int[] b) {
  List<Integer> result = new ArrayList<>();
  for (int i : b) {
   result.add(a * i);
  }
  int[] resultArray = new int[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static double[] multiplyDouble(double a, double[] b) {
  List<Double> result = new ArrayList<>();
  for (double i : b) {
   result.add(a * i);
  }
  double[] resultArray = new double[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static float[] multiplyFloat(float a, float[] b) {
  List<Float> result = new ArrayList<>();
  for (float i : b) {
   result.add(a * i);
  }
  float[] resultArray = new float[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static short[] multiplyShort(short a, short[] b) {
  List<Short> result = new ArrayList<>();
  for (short i : b) {
   result.add((short)(a * i));
  }
  short[] resultArray = new short[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static long[] multiplyLong(long a, long[] b) {
  List<Long> result = new ArrayList<>();
  for (long i : b) {
   result.add(a * i);
  }
  long[] resultArray = new long[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static byte[] multiplyByte(byte a, byte[] b) {
  List<Byte> result = new ArrayList<>();
  for (byte i : b) {
   result.add((byte)(a * i));
  }
  byte[] resultArray = new byte[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static List<Integer> multiplyInt(int a, List<Integer> b) {
  List<Integer> result = new ArrayList<>();
  for (int i : b) {
   result.add(a * i);
  }
  return result;
 }
 public static List<Double> multiplyDouble(double a, List<Double> b) {
  List<Double> result = new ArrayList<>();
  for (double i : b) {
   result.add(a * i);
  }
  return result;
 }
 public static List<Float> multiplyFloat(float a, List<Float> b) {
  List<Float> result = new ArrayList<>();
  for (float i : b) {
   result.add(a * i);
  }
  return result;
 }
 public static List<Short> multiplyShort(short a, List<Short> b) {
  List<Short> result = new ArrayList<>();
  for (short i : b) {
   result.add((short)(a * i));
  }
  return result;
 }
 public static List<Long> multiplyLong(long a, List<Long> b) {
  List<Long> result = new ArrayList<>();
  for (long i : b) {
   result.add(a * i);
  }
  return result;
 }
 public static List<Byte> multiplyByte(byte a, List<Byte> b) {
  List<Byte> result = new ArrayList<>();
  for (byte i : b) {
   result.add((byte)(a + i));
  }
  return result;
 }
}