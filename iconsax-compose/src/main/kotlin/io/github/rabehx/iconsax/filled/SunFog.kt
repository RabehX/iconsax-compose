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


val Iconsax.Filled.SunFog: ImageVector
    get() {
        if (_SunFog != null) {
            return _SunFog!!
        }
        _SunFog = ImageVector.Builder(
            name = "Filled.SunFog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.481f, 12.25f)
                curveTo(18.761f, 12.25f, 19.001f, 12.01f, 18.981f, 11.73f)
                curveTo(18.711f, 8.1f, 15.691f, 5.25f, 12.001f, 5.25f)
                curveTo(8.311f, 5.25f, 5.291f, 8.1f, 5.021f, 11.73f)
                curveTo(5.001f, 12.01f, 5.241f, 12.25f, 5.521f, 12.25f)
                horizontalLineTo(18.481f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 13f)
                horizontalLineTo(21.92f)
                curveTo(21.37f, 13f, 20.92f, 12.55f, 20.92f, 12f)
                curveTo(20.92f, 11.45f, 21.37f, 11f, 21.92f, 11f)
                curveTo(22.47f, 11f, 22.96f, 11.45f, 22.96f, 12f)
                curveTo(22.96f, 12.55f, 22.55f, 13f, 22f, 13f)
                close()
                moveTo(2.08f, 13f)
                horizontalLineTo(2f)
                curveTo(1.45f, 13f, 1f, 12.55f, 1f, 12f)
                curveTo(1f, 11.45f, 1.45f, 11f, 2f, 11f)
                curveTo(2.55f, 11f, 3.04f, 11.45f, 3.04f, 12f)
                curveTo(3.04f, 12.55f, 2.63f, 13f, 2.08f, 13f)
                close()
                moveTo(19.01f, 5.99f)
                curveTo(18.75f, 5.99f, 18.5f, 5.89f, 18.3f, 5.7f)
                curveTo(17.91f, 5.31f, 17.91f, 4.68f, 18.3f, 4.29f)
                lineTo(18.43f, 4.16f)
                curveTo(18.82f, 3.77f, 19.45f, 3.77f, 19.84f, 4.16f)
                curveTo(20.23f, 4.55f, 20.23f, 5.18f, 19.84f, 5.57f)
                lineTo(19.71f, 5.7f)
                curveTo(19.52f, 5.89f, 19.27f, 5.99f, 19.01f, 5.99f)
                close()
                moveTo(4.99f, 5.99f)
                curveTo(4.73f, 5.99f, 4.48f, 5.89f, 4.28f, 5.7f)
                lineTo(4.15f, 5.56f)
                curveTo(3.76f, 5.17f, 3.76f, 4.54f, 4.15f, 4.15f)
                curveTo(4.54f, 3.76f, 5.17f, 3.76f, 5.56f, 4.15f)
                lineTo(5.69f, 4.28f)
                curveTo(6.08f, 4.67f, 6.08f, 5.3f, 5.69f, 5.69f)
                curveTo(5.5f, 5.89f, 5.24f, 5.99f, 4.99f, 5.99f)
                close()
                moveTo(12f, 3.04f)
                curveTo(11.45f, 3.04f, 11f, 2.63f, 11f, 2.08f)
                verticalLineTo(2f)
                curveTo(11f, 1.45f, 11.45f, 1f, 12f, 1f)
                curveTo(12.55f, 1f, 13f, 1.45f, 13f, 2f)
                curveTo(13f, 2.55f, 12.55f, 3.04f, 12f, 3.04f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 15.75f)
                horizontalLineTo(4f)
                curveTo(3.59f, 15.75f, 3.25f, 15.41f, 3.25f, 15f)
                curveTo(3.25f, 14.59f, 3.59f, 14.25f, 4f, 14.25f)
                horizontalLineTo(20f)
                curveTo(20.41f, 14.25f, 20.75f, 14.59f, 20.75f, 15f)
                curveTo(20.75f, 15.41f, 20.41f, 15.75f, 20f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 18.75f)
                horizontalLineTo(6f)
                curveTo(5.59f, 18.75f, 5.25f, 18.41f, 5.25f, 18f)
                curveTo(5.25f, 17.59f, 5.59f, 17.25f, 6f, 17.25f)
                horizontalLineTo(18f)
                curveTo(18.41f, 17.25f, 18.75f, 17.59f, 18.75f, 18f)
                curveTo(18.75f, 18.41f, 18.41f, 18.75f, 18f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 21.75f)
                horizontalLineTo(9f)
                curveTo(8.59f, 21.75f, 8.25f, 21.41f, 8.25f, 21f)
                curveTo(8.25f, 20.59f, 8.59f, 20.25f, 9f, 20.25f)
                horizontalLineTo(15f)
                curveTo(15.41f, 20.25f, 15.75f, 20.59f, 15.75f, 21f)
                curveTo(15.75f, 21.41f, 15.41f, 21.75f, 15f, 21.75f)
                close()
            }
        }.build()

        return _SunFog!!
    }

@Suppress("ObjectPropertyName")
private var _SunFog: ImageVector? = null
