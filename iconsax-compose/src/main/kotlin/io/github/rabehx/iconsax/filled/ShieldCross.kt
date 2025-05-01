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


val Iconsax.Filled.ShieldCross: ImageVector
    get() {
        if (_ShieldCross != null) {
            return _ShieldCross!!
        }
        _ShieldCross = ImageVector.Builder(
            name = "Filled.ShieldCross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.541f, 4.12f)
                lineTo(13.041f, 2.06f)
                curveTo(12.471f, 1.85f, 11.541f, 1.85f, 10.971f, 2.06f)
                lineTo(5.471f, 4.12f)
                curveTo(4.411f, 4.52f, 3.551f, 5.76f, 3.551f, 6.89f)
                verticalLineTo(14.99f)
                curveTo(3.551f, 15.8f, 4.081f, 16.87f, 4.731f, 17.35f)
                lineTo(10.231f, 21.46f)
                curveTo(11.201f, 22.19f, 12.791f, 22.19f, 13.761f, 21.46f)
                lineTo(19.261f, 17.35f)
                curveTo(19.911f, 16.86f, 20.441f, 15.8f, 20.441f, 14.99f)
                verticalLineTo(6.89f)
                curveTo(20.451f, 5.76f, 19.591f, 4.52f, 18.541f, 4.12f)
                close()
                moveTo(14.681f, 13.97f)
                curveTo(14.531f, 14.12f, 14.341f, 14.19f, 14.151f, 14.19f)
                curveTo(13.961f, 14.19f, 13.771f, 14.12f, 13.621f, 13.97f)
                lineTo(12.031f, 12.38f)
                lineTo(10.391f, 14.02f)
                curveTo(10.241f, 14.17f, 10.051f, 14.24f, 9.861f, 14.24f)
                curveTo(9.671f, 14.24f, 9.481f, 14.17f, 9.331f, 14.02f)
                curveTo(9.041f, 13.73f, 9.041f, 13.25f, 9.331f, 12.96f)
                lineTo(10.971f, 11.32f)
                lineTo(9.371f, 9.72f)
                curveTo(9.081f, 9.43f, 9.081f, 8.95f, 9.371f, 8.66f)
                curveTo(9.661f, 8.37f, 10.141f, 8.37f, 10.431f, 8.66f)
                lineTo(12.021f, 10.25f)
                lineTo(13.571f, 8.7f)
                curveTo(13.861f, 8.41f, 14.341f, 8.41f, 14.631f, 8.7f)
                curveTo(14.921f, 8.99f, 14.921f, 9.47f, 14.631f, 9.76f)
                lineTo(13.081f, 11.31f)
                lineTo(14.671f, 12.9f)
                curveTo(14.971f, 13.2f, 14.971f, 13.67f, 14.681f, 13.97f)
                close()
            }
        }.build()

        return _ShieldCross!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldCross: ImageVector? = null
