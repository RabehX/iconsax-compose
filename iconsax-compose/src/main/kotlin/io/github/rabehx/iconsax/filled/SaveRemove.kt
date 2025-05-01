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


val Iconsax.Filled.SaveRemove: ImageVector
    get() {
        if (_SaveRemove != null) {
            return _SaveRemove!!
        }
        _SaveRemove = ImageVector.Builder(
            name = "Filled.SaveRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 5.11f)
                verticalLineTo(16.47f)
                curveTo(22f, 17.92f, 20.96f, 18.53f, 19.69f, 17.83f)
                lineTo(17.76f, 16.75f)
                curveTo(17.6f, 16.66f, 17.5f, 16.49f, 17.5f, 16.31f)
                verticalLineTo(8.99f)
                curveTo(17.5f, 6.45f, 15.43f, 4.38f, 12.89f, 4.38f)
                horizontalLineTo(8.82f)
                curveTo(8.45f, 4.38f, 8.19f, 3.99f, 8.36f, 3.67f)
                curveTo(8.88f, 2.68f, 9.92f, 2f, 11.11f, 2f)
                horizontalLineTo(18.89f)
                curveTo(20.6f, 2f, 22f, 3.4f, 22f, 5.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.89f, 5.879f)
                horizontalLineTo(5.11f)
                curveTo(3.4f, 5.879f, 2f, 7.279f, 2f, 8.989f)
                verticalLineTo(20.349f)
                curveTo(2f, 21.799f, 3.04f, 22.409f, 4.31f, 21.709f)
                lineTo(8.24f, 19.519f)
                curveTo(8.66f, 19.289f, 9.34f, 19.289f, 9.76f, 19.519f)
                lineTo(13.69f, 21.709f)
                curveTo(14.96f, 22.409f, 16f, 21.799f, 16f, 20.349f)
                verticalLineTo(8.989f)
                curveTo(16f, 7.279f, 14.6f, 5.879f, 12.89f, 5.879f)
                close()
                moveTo(10.94f, 12.879f)
                curveTo(11.23f, 13.169f, 11.23f, 13.649f, 10.94f, 13.939f)
                curveTo(10.79f, 14.089f, 10.6f, 14.159f, 10.41f, 14.159f)
                curveTo(10.22f, 14.159f, 10.03f, 14.089f, 9.88f, 13.939f)
                lineTo(9f, 13.059f)
                lineTo(8.12f, 13.939f)
                curveTo(7.97f, 14.089f, 7.78f, 14.159f, 7.59f, 14.159f)
                curveTo(7.4f, 14.159f, 7.21f, 14.089f, 7.06f, 13.939f)
                curveTo(6.77f, 13.649f, 6.77f, 13.169f, 7.06f, 12.879f)
                lineTo(7.94f, 11.999f)
                lineTo(7.06f, 11.119f)
                curveTo(6.77f, 10.829f, 6.77f, 10.349f, 7.06f, 10.059f)
                curveTo(7.35f, 9.769f, 7.83f, 9.769f, 8.12f, 10.059f)
                lineTo(9f, 10.939f)
                lineTo(9.88f, 10.059f)
                curveTo(10.17f, 9.769f, 10.65f, 9.769f, 10.94f, 10.059f)
                curveTo(11.23f, 10.349f, 11.23f, 10.829f, 10.94f, 11.119f)
                lineTo(10.06f, 11.999f)
                lineTo(10.94f, 12.879f)
                close()
            }
        }.build()

        return _SaveRemove!!
    }

@Suppress("ObjectPropertyName")
private var _SaveRemove: ImageVector? = null
