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


val Iconsax.Filled.Wallet: ImageVector
    get() {
        if (_Wallet != null) {
            return _Wallet!!
        }
        _Wallet = ImageVector.Builder(
            name = "Filled.Wallet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.45f, 13.641f)
                verticalLineTo(14.641f)
                curveTo(21.45f, 14.911f, 21.24f, 15.131f, 20.96f, 15.141f)
                horizontalLineTo(19.5f)
                curveTo(18.97f, 15.141f, 18.49f, 14.751f, 18.45f, 14.231f)
                curveTo(18.42f, 13.921f, 18.54f, 13.631f, 18.74f, 13.431f)
                curveTo(18.92f, 13.241f, 19.17f, 13.141f, 19.44f, 13.141f)
                horizontalLineTo(20.95f)
                curveTo(21.24f, 13.151f, 21.45f, 13.371f, 21.45f, 13.641f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.989f, 12.691f)
                curveTo(17.489f, 13.181f, 17.249f, 13.911f, 17.449f, 14.671f)
                curveTo(17.709f, 15.601f, 18.619f, 16.191f, 19.579f, 16.191f)
                horizontalLineTo(20.449f)
                curveTo(20.999f, 16.191f, 21.449f, 16.641f, 21.449f, 17.191f)
                verticalLineTo(17.381f)
                curveTo(21.449f, 19.451f, 19.759f, 21.141f, 17.689f, 21.141f)
                horizontalLineTo(6.209f)
                curveTo(4.139f, 21.141f, 2.449f, 19.451f, 2.449f, 17.381f)
                verticalLineTo(10.651f)
                curveTo(2.449f, 9.421f, 3.039f, 8.331f, 3.949f, 7.651f)
                curveTo(4.579f, 7.171f, 5.359f, 6.891f, 6.209f, 6.891f)
                horizontalLineTo(17.689f)
                curveTo(19.759f, 6.891f, 21.449f, 8.581f, 21.449f, 10.651f)
                verticalLineTo(11.091f)
                curveTo(21.449f, 11.641f, 20.999f, 12.091f, 20.449f, 12.091f)
                horizontalLineTo(19.429f)
                curveTo(18.869f, 12.091f, 18.359f, 12.311f, 17.989f, 12.691f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.199f, 4.82f)
                curveTo(16.469f, 5.09f, 16.239f, 5.51f, 15.859f, 5.51f)
                lineTo(8.179f, 5.5f)
                curveTo(7.739f, 5.5f, 7.509f, 4.96f, 7.829f, 4.65f)
                lineTo(9.449f, 3.02f)
                curveTo(10.819f, 1.66f, 13.039f, 1.66f, 14.409f, 3.02f)
                lineTo(16.159f, 4.79f)
                curveTo(16.169f, 4.8f, 16.189f, 4.81f, 16.199f, 4.82f)
                close()
            }
        }.build()

        return _Wallet!!
    }

@Suppress("ObjectPropertyName")
private var _Wallet: ImageVector? = null
