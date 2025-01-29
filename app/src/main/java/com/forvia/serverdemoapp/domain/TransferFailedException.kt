package com.forvia.serverdemoapp.domain

import java.io.IOException

class TransferFailedException: IOException("Reading incoming data failed")
