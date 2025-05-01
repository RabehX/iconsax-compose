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


val Iconsax.Filled.Scroll: ImageVector
    get() {
        if (_Scroll != null) {
            return _Scroll!!
        }
        _Scroll = ImageVector.Builder(
            name = "Filled.Scroll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(10.13f, 14.5f)
                curveTo(10.42f, 14.79f, 10.42f, 15.27f, 10.13f, 15.56f)
                curveTo(9.98f, 15.71f, 9.79f, 15.78f, 9.6f, 15.78f)
                curveTo(9.41f, 15.78f, 9.22f, 15.71f, 9.07f, 15.56f)
                lineTo(6.58f, 13.07f)
                curveTo(5.99f, 12.48f, 5.99f, 11.53f, 6.58f, 10.94f)
                lineTo(9.07f, 8.45f)
                curveTo(9.36f, 8.16f, 9.84f, 8.16f, 10.13f, 8.45f)
                curveTo(10.42f, 8.74f, 10.42f, 9.22f, 10.13f, 9.51f)
                lineTo(7.64f, 12f)
                lineTo(10.13f, 14.5f)
                close()
                moveTo(17.42f, 13.06f)
                lineTo(14.93f, 15.55f)
                curveTo(14.78f, 15.7f, 14.59f, 15.77f, 14.4f, 15.77f)
                curveTo(14.21f, 15.77f, 14.02f, 15.7f, 13.87f, 15.55f)
                curveTo(13.58f, 15.26f, 13.58f, 14.78f, 13.87f, 14.49f)
                lineTo(16.36f, 12f)
                lineTo(13.87f, 9.5f)
                curveTo(13.58f, 9.21f, 13.58f, 8.73f, 13.87f, 8.44f)
                curveTo(14.16f, 8.15f, 14.64f, 8.15f, 14.93f, 8.44f)
                lineTo(17.42f, 10.93f)
                curveTo(18.01f, 11.52f, 18.01f, 12.48f, 17.42f, 13.06f)
                close()
            }
        }.build()

        return _Scroll!!
    }

@Suppress("ObjectPropertyName")
private var _Scroll: ImageVector? = null
