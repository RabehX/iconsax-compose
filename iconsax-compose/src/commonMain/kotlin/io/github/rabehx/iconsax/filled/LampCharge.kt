/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.LampCharge: ImageVector
    get() {
        if (_LampCharge != null) {
            return _LampCharge!!
        }
        _LampCharge = ImageVector.Builder(
            name = "Filled.LampCharge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.259f, 21.998f)
                curveTo(15.199f, 21.998f, 15.129f, 21.988f, 15.069f, 21.968f)
                curveTo(13.059f, 21.398f, 10.949f, 21.398f, 8.939f, 21.968f)
                curveTo(8.569f, 22.068f, 8.179f, 21.858f, 8.079f, 21.488f)
                curveTo(7.969f, 21.118f, 8.189f, 20.728f, 8.559f, 20.628f)
                curveTo(10.819f, 19.988f, 13.199f, 19.988f, 15.459f, 20.628f)
                curveTo(15.829f, 20.738f, 16.049f, 21.118f, 15.939f, 21.488f)
                curveTo(15.839f, 21.798f, 15.559f, 21.998f, 15.259f, 21.998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.211f, 6.361f)
                curveTo(18.171f, 4.261f, 16.161f, 2.711f, 13.831f, 2.201f)
                curveTo(11.391f, 1.661f, 8.891f, 2.241f, 6.981f, 3.781f)
                curveTo(5.061f, 5.311f, 3.971f, 7.601f, 3.971f, 10.052f)
                curveTo(3.971f, 12.642f, 5.521f, 15.351f, 7.861f, 16.921f)
                verticalLineTo(17.751f)
                curveTo(7.851f, 18.031f, 7.841f, 18.462f, 8.181f, 18.812f)
                curveTo(8.531f, 19.171f, 9.051f, 19.212f, 9.461f, 19.212f)
                horizontalLineTo(14.591f)
                curveTo(15.131f, 19.212f, 15.541f, 19.062f, 15.821f, 18.781f)
                curveTo(16.201f, 18.392f, 16.191f, 17.892f, 16.181f, 17.622f)
                verticalLineTo(16.921f)
                curveTo(19.281f, 14.832f, 21.231f, 10.422f, 19.211f, 6.361f)
                close()
                moveTo(13.721f, 11.622f)
                lineTo(12.651f, 13.481f)
                curveTo(12.511f, 13.722f, 12.261f, 13.861f, 12.001f, 13.861f)
                curveTo(11.871f, 13.861f, 11.741f, 13.832f, 11.631f, 13.762f)
                curveTo(11.271f, 13.552f, 11.151f, 13.092f, 11.351f, 12.741f)
                lineTo(12.201f, 11.262f)
                horizontalLineTo(11.361f)
                curveTo(10.861f, 11.262f, 10.451f, 11.042f, 10.231f, 10.672f)
                curveTo(10.011f, 10.292f, 10.031f, 9.831f, 10.281f, 9.391f)
                lineTo(11.351f, 7.531f)
                curveTo(11.561f, 7.171f, 12.021f, 7.051f, 12.371f, 7.251f)
                curveTo(12.731f, 7.461f, 12.851f, 7.921f, 12.651f, 8.271f)
                lineTo(11.801f, 9.751f)
                horizontalLineTo(12.641f)
                curveTo(13.141f, 9.751f, 13.551f, 9.971f, 13.771f, 10.342f)
                curveTo(13.991f, 10.722f, 13.971f, 11.191f, 13.721f, 11.622f)
                close()
            }
        }.build()

        return _LampCharge!!
    }

@Suppress("ObjectPropertyName")
private var _LampCharge: ImageVector? = null
