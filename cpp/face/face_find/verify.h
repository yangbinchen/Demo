//
// Created by Wang,Jian(BNBPRD) on 17/3/22.
//

#ifndef CPP_VERIFY_H
#define CPP_VERIFY_H
#include <string>
#include <vector>
int verify(std::string &json_result, const std::string &uid, const std::vector<std::string> &images, const std::string &access_token, int top_num = 1);

#endif //CPP_VERIFY_H
