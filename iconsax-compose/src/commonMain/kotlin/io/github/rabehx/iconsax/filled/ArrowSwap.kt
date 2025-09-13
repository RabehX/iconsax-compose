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

val Iconsax.Filled.ArrowSwap: ImageVector
    get() {
        if (_ArrowSwap != null) {
            return _ArrowSwap!!
        }
        _ArrowSwap = ImageVector.Builder(
            name = "Filled.ArrowSwap",
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
                moveTo(10.99f, 17f)
                curveTo(10.99f, 17.1f, 10.97f, 17.19f, 10.93f, 17.29f)
                curveTo(10.85f, 17.47f, 10.71f, 17.62f, 10.52f, 17.7f)
                curveTo(10.43f, 17.74f, 10.33f, 17.76f, 10.23f, 17.76f)
                curveTo(10.13f, 17.76f, 10.04f, 17.74f, 9.94f, 17.7f)
                curveTo(9.85f, 17.66f, 9.77f, 17.61f, 9.7f, 17.54f)
                lineTo(6.75f, 14.59f)
                curveTo(6.46f, 14.3f, 6.46f, 13.82f, 6.75f, 13.53f)
                curveTo(7.04f, 13.24f, 7.52f, 13.24f, 7.81f, 13.53f)
                lineTo(9.48f, 15.2f)
                verticalLineTo(7f)
                curveTo(9.48f, 6.59f, 9.82f, 6.25f, 10.23f, 6.25f)
                curveTo(10.64f, 6.25f, 10.99f, 6.59f, 10.99f, 7f)
                verticalLineTo(17f)
                close()
                moveTo(17.24f, 10.48f)
                curveTo(17.09f, 10.63f, 16.9f, 10.7f, 16.71f, 10.7f)
                curveTo(16.52f, 10.7f, 16.33f, 10.63f, 16.18f, 10.48f)
                lineTo(14.51f, 8.81f)
                verticalLineTo(17f)
                curveTo(14.51f, 17.41f, 14.17f, 17.75f, 13.76f, 17.75f)
                curveTo(13.35f, 17.75f, 13.01f, 17.41f, 13.01f, 17f)
                verticalLineTo(7f)
                curveTo(13.01f, 6.9f, 13.03f, 6.81f, 13.07f, 6.71f)
                curveTo(13.15f, 6.53f, 13.29f, 6.38f, 13.48f, 6.3f)
                curveTo(13.66f, 6.22f, 13.87f, 6.22f, 14.05f, 6.3f)
                curveTo(14.14f, 6.34f, 14.22f, 6.39f, 14.29f, 6.46f)
                lineTo(17.24f, 9.41f)
                curveTo(17.53f, 9.71f, 17.53f, 10.19f, 17.24f, 10.48f)
                close()
            }
        }.build()

        return _ArrowSwap!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSwap: ImageVector? = null
