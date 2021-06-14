{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[] productExceptSelf(int[] nums) \{\
        if(nums==null || nums.length==0) return nums;\
        int n = nums.length;\
        \
        int[] res = new int[n];\
        int right=1,left=1;\
        \
        for(int i =0;i<n;i++)\{\
            res[i]=1;\
        \}\
        \
        for(int i=0;i<n;i++)\{\
            res[i]*=left;\
            left*=nums[i];\
        \}\
        \
        for(int i=n-1;i>=0;i--)\{\
            res[i]*=right;\
            right*=nums[i];\
        \}\
        \
        return res;\
    \}\
\}}