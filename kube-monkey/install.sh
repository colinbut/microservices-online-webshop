#!/bin/bash

kubectl create configmap km-config --from-file=config.toml=config.toml -n kube-system

# helm repo add kubemonkey https://asobti.github.io/kube-monkey/charts/repo
# helm repo update

# helm install kube-monkey kubemonkey/kube-monkey --version 1.4.0
