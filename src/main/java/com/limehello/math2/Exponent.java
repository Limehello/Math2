package com.limehello.math2;

import java.util.ArrayList;
import java.util.List;

public class Exponent {
 private Exponent() {}
 public static int power(int a, int b){
  return (int)Math.pow(a, b);
 }
 public static int powerInt(int a, int b){
  return (int)Math.pow(a, b);
 }
 public static double power(double a, double b) {
  return Math.pow(a, b);
 }
 public static double powerDouble(double a, double b) {
  return Math.pow(a, b);
 }
 public static float power(float a, float b) {
  return (float)Math.pow(a, b);
 }
 public static float powerFloat(float a, float b) {
  return (float)Math.pow(a, b);
 }
 public static short power(short a, short b) {
  return (short)Math.pow(a, b);
 }
 public static short powerShort(short a, short b) {
  return (short)Math.pow(a, b);
 }
 public static long power(long a, long b) {
  return (long)Math.pow(a, b);
 }
 public static long powerLong(long a, long b) {
  return (long)Math.pow(a, b);
 }
 public static byte power(byte a, byte b) {
  return (byte)Math.pow(a, b);
 }
 public static byte powerByte(byte a, byte b) {
  return (byte)Math.pow(a, b);
 }
 public static int power(int... n){
  int result = 1;
  for (int a : n) {
   result = (int)Math.pow(result, a);
  }
  return result;
 }
 public static int powerInt(int... n){
  int result = 1;
  for (int a : n) {
   result = (int)Math.pow(result, a);
  }
  return result;
 }
 public static double power(double... n){
  double result = 1;
  for (double a : n) {
   result = Math.pow(result, a);
  }
  return result;
 }
 public static double powerDouble(double... n){
  double result = 1;
  for (double a : n) {
   result = Math.pow(result, a);
  }
  return result;
 }
 public static float power(float... n){
  float result = 1;
  for (float a : n) {
   result = (float)Math.pow(result, a);
  }
  return result;
 }
 public static float powerFloat(float... n){
  float result = 1;
  for (float a : n) {
   result = (float)Math.pow(result, a);
  }
  return result;
 }
 public static short power(short... n){
  short result = 1;
  for (short a : n) {
   result = (short)Math.pow(result, a);
  }
  return result;
 }
 public static short powerShort(short... n){
  short result = 1;
  for (short a : n) {
   result = (short)Math.pow(result, a);
  }
  return result;
 }
 public static long power(long... n){
  long result = 1;
  for (long a : n) {
   result = (long)Math.pow(result, a);
  }
  return result;
 }
 public static long powerLong(long... n){
  long result = 1;
  for (long a : n) {
   result = (long)Math.pow(result, a);
  }
  return result;
 }
 public static byte power(byte... n){
  byte result = 1;
  for (byte a : n) {
   result = (byte)Math.pow(result, a);
  }
  return result;
 }
 public static byte powerByte(byte... n){
  byte result = 1;
  for (byte a : n) {
   result = (byte)Math.pow(result, a);
  }
  return result;
 }
 public static int powerInt(List<Integer> n){
  int result = 1;
  for (int a : n) {
   result = (int)Math.pow(result, a);
  }
  return result;
 }
 public static double powerDouble(List<Double> n){
  double result = 1;
  for (double a : n) {
   result = Math.pow(result, a);
  }
  return result;
 }
 public static float powerFloat(List<Float> n){
  float result = 1;
  for (float a : n) {
   result = (float)Math.pow(result, a);
  }
  return result;
 }
 public static short powerShort(List<Short> n){
  short result = 1;
  for (short a : n) {
   result = (short)Math.pow(result, a);
  }
  return result;
 }
 public static long powerLong(List<Long> n){
  long result = 1;
  for (long a : n) {
   result = (long)Math.pow(result, a);
  }
  return result;
 }
 public static byte powerByte(List<Byte> n){
  byte result = 1;
  for (byte a : n) {
   result = (byte)Math.pow(result, a);
  }
  return result;
 }
 public static int[] powerInt(int[] a, int[] b) {
  List<Integer> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add((int)Math.pow(((i < a.length) ? a[i] : 1), ((i < b.length) ? b[i] : 1)));
  }
  int[] resultArray = new int[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static double[] powerDouble(double[] a, double[] b) {
  List<Double> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add(Math.pow(((i < a.length) ? a[i] : 1), ((i < b.length) ? b[i] : 1)));
  }
  double[] resultArray = new double[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static float[] powerFloat(float[] a, float[] b) {
  List<Float> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add((float)Math.pow(((i < a.length) ? a[i] : 1), ((i < b.length) ? b[i] : 1)));
  }
  float[] resultArray = new float[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static short[] powerShort(short[] a, short[] b) {
  List<Short> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add((short)Math.pow(((i < a.length) ? a[i] : 1), ((i < b.length) ? b[i] : 1)));
  }
  short[] resultArray = new short[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static long[] powerLong(long[] a, long[] b) {
  List<Long> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add((long)Math.pow(((i < a.length) ? a[i] : 1), ((i < b.length) ? b[i] : 1)));
  }
  long[] resultArray = new long[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static byte[] powerByte(byte[] a, byte[] b) {
  List<Byte> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.length, b.length); i++) {
   result.add((byte)Math.pow(((i < a.length) ? a[i] : 1), ((i < b.length) ? b[i] : 1)));
  }
  byte[] resultArray = new byte[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static List<Integer> powerInt(List<Integer> a, List<Integer> b) {
  List<Integer> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add((int)Math.pow(((i < a.size()) ? a.get(i) : 1), ((i < b.size()) ? b.get(i) : 1)));
  }
  return result;
 }
 public static List<Double> powerDouble(List<Double> a, List<Double> b) {
  List<Double> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add(Math.pow(((i < a.size()) ? a.get(i) : 1), ((i < b.size()) ? b.get(i) : 1)));
  }
  return result;
 }
 public static List<Float> powerFloat(List<Float> a, List<Float> b) {
  List<Float> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add((float)Math.pow(((i < a.size()) ? a.get(i) : 1), ((i < b.size()) ? b.get(i) : 1)));
  }
  return result;
 }
 public static List<Short> powerShort(List<Short> a, List<Short> b) {
  List<Short> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add((short)Math.pow(((i < a.size()) ? a.get(i) : 1), ((i < b.size()) ? b.get(i) : 1)));
  }
  return result;
 }
 public static List<Long> powerLong(List<Long> a, List<Long> b) {
  List<Long> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add((long)Math.pow(((i < a.size()) ? a.get(i) : 1), ((i < b.size()) ? b.get(i) : 1)));
  }
  return result;
 }
 public static List<Byte> powerByte(List<Byte> a, List<Byte> b) {
  List<Byte> result = new ArrayList<>();
  for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
   result.add((byte)Math.pow(((i < a.size()) ? a.get(i) : 1), ((i < b.size()) ? b.get(i) : 1)));
  }
  return result;
 }
 public static int[] powerInt(int a, int[] b) {
  List<Integer> result = new ArrayList<>();
  for (int i : b) {
   result.add((int)(Math.pow(i, a)));
  }
  int[] resultArray = new int[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static double[] powerDouble(double a, double[] b) {
  List<Double> result = new ArrayList<>();
  for (double i : b) {
   result.add((double)(Math.pow(i, a)));
  }
  double[] resultArray = new double[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static float[] powerFloat(float a, float[] b) {
  List<Float> result = new ArrayList<>();
  for (float i : b) {
   result.add((float)(Math.pow(i, a)));
  }
  float[] resultArray = new float[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static short[] powerShort(short a, short[] b) {
  List<Short> result = new ArrayList<>();
  for (short i : b) {
   result.add((short)(Math.pow(i, a)));
  }
  short[] resultArray = new short[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static long[] powerLong(long a, long[] b) {
  List<Long> result = new ArrayList<>();
  for (long i : b) {
   result.add((long)(Math.pow(i, a)));
  }
  long[] resultArray = new long[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static byte[] powerByte(byte a, byte[] b) {
  List<Byte> result = new ArrayList<>();
  for (byte i : b) {
   result.add((byte)(Math.pow(i, a)));
  }
  byte[] resultArray = new byte[result.size()];
  for (int i = 0; i < result.size(); i++) {
   resultArray[i] = result.get(i);
  }
  return resultArray;
 }
 public static List<Integer> powerInt(int a, List<Integer> b) {
  List<Integer> result = new ArrayList<>();
  for (int i : b) {
   result.add((int)(Math.pow(i, a)));
  }
  return result;
 }
 public static List<Double> powerDouble(double a, List<Double> b) {
  List<Double> result = new ArrayList<>();
  for (double i : b) {
   result.add((double)(Math.pow(i, a)));
  }
  return result;
 }
 public static List<Float> powerFloat(float a, List<Float> b) {
  List<Float> result = new ArrayList<>();
  for (float i : b) {
   result.add((float)(Math.pow(i, a)));
  }
  return result;
 }
 public static List<Short> powerShort(short a, List<Short> b) {
  List<Short> result = new ArrayList<>();
  for (short i : b) {
   result.add((short)(Math.pow(i, a)));
  }
  return result;
 }
 public static List<Long> powerLong(long a, List<Long> b) {
  List<Long> result = new ArrayList<>();
  for (long i : b) {
   result.add((long)(Math.pow(i, a)));
  }
  return result;
 }
 public static List<Byte> powerByte(byte a, List<Byte> b) {
  List<Byte> result = new ArrayList<>();
  for (byte i : b) {
   result.add((byte)(Math.pow(i, a)));
  }
  return result;
 }
}
