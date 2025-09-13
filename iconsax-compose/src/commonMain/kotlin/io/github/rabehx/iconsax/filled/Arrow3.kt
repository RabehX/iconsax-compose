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

val Iconsax.Filled.Arrow3: ImageVector
    get() {
        if (_Arrow3 != null) {
            return _Arrow3!!
        }
        _Arrow3 = ImageVector.Builder(
            name = "Filled.Arrow3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.981f, 6.19f)
                lineTo(7.271f, 2.48f)
                curveTo(7.201f, 2.41f, 7.111f, 2.35f, 7.011f, 2.31f)
                curveTo(7.001f, 2.31f, 6.991f, 2.31f, 6.981f, 2.3f)
                curveTo(6.901f, 2.27f, 6.821f, 2.25f, 6.731f, 2.25f)
                curveTo(6.531f, 2.25f, 6.341f, 2.33f, 6.201f, 2.47f)
                lineTo(2.471f, 6.19f)
                curveTo(2.181f, 6.48f, 2.181f, 6.96f, 2.471f, 7.25f)
                curveTo(2.761f, 7.54f, 3.241f, 7.54f, 3.531f, 7.25f)
                lineTo(5.981f, 4.8f)
                verticalLineTo(21f)
                curveTo(5.981f, 21.41f, 6.321f, 21.75f, 6.731f, 21.75f)
                curveTo(7.141f, 21.75f, 7.481f, 21.41f, 7.481f, 21f)
                verticalLineTo(4.81f)
                lineTo(9.921f, 7.25f)
                curveTo(10.071f, 7.4f, 10.261f, 7.47f, 10.451f, 7.47f)
                curveTo(10.641f, 7.47f, 10.831f, 7.4f, 10.981f, 7.25f)
                curveTo(11.271f, 6.96f, 11.271f, 6.49f, 10.981f, 6.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.528f, 16.75f)
                curveTo(21.238f, 16.46f, 20.758f, 16.46f, 20.468f, 16.75f)
                lineTo(18.018f, 19.2f)
                verticalLineTo(3f)
                curveTo(18.018f, 2.59f, 17.678f, 2.25f, 17.268f, 2.25f)
                curveTo(16.858f, 2.25f, 16.518f, 2.59f, 16.518f, 3f)
                verticalLineTo(19.19f)
                lineTo(14.078f, 16.75f)
                curveTo(13.788f, 16.46f, 13.308f, 16.46f, 13.018f, 16.75f)
                curveTo(12.728f, 17.04f, 12.728f, 17.52f, 13.018f, 17.81f)
                lineTo(16.728f, 21.52f)
                curveTo(16.798f, 21.59f, 16.888f, 21.65f, 16.988f, 21.69f)
                curveTo(16.998f, 21.69f, 17.008f, 21.69f, 17.018f, 21.7f)
                curveTo(17.098f, 21.73f, 17.188f, 21.75f, 17.278f, 21.75f)
                curveTo(17.478f, 21.75f, 17.668f, 21.67f, 17.808f, 21.53f)
                lineTo(21.528f, 17.81f)
                curveTo(21.818f, 17.51f, 21.818f, 17.04f, 21.528f, 16.75f)
                close()
            }
        }.build()

        return _Arrow3!!
    }

@Suppress("ObjectPropertyName")
private var _Arrow3: ImageVector? = null
