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

val Iconsax.Filled.ArrowSwapHorizontal: ImageVector
    get() {
        if (_ArrowSwapHorizontal != null) {
            return _ArrowSwapHorizontal!!
        }
        _ArrowSwapHorizontal = ImageVector.Builder(
            name = "Filled.ArrowSwapHorizontal",
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
                moveTo(17.69f, 14.05f)
                curveTo(17.65f, 14.14f, 17.6f, 14.22f, 17.53f, 14.29f)
                lineTo(14.58f, 17.24f)
                curveTo(14.43f, 17.39f, 14.24f, 17.46f, 14.05f, 17.46f)
                curveTo(13.86f, 17.46f, 13.67f, 17.39f, 13.52f, 17.24f)
                curveTo(13.23f, 16.95f, 13.23f, 16.47f, 13.52f, 16.18f)
                lineTo(15.19f, 14.51f)
                horizontalLineTo(7f)
                curveTo(6.59f, 14.51f, 6.25f, 14.17f, 6.25f, 13.76f)
                curveTo(6.25f, 13.35f, 6.59f, 13.01f, 7f, 13.01f)
                horizontalLineTo(17f)
                curveTo(17.1f, 13.01f, 17.19f, 13.03f, 17.29f, 13.07f)
                curveTo(17.47f, 13.15f, 17.62f, 13.29f, 17.7f, 13.48f)
                curveTo(17.77f, 13.66f, 17.77f, 13.86f, 17.69f, 14.05f)
                close()
                moveTo(17f, 10.99f)
                horizontalLineTo(7f)
                curveTo(6.9f, 10.99f, 6.81f, 10.97f, 6.71f, 10.93f)
                curveTo(6.53f, 10.85f, 6.38f, 10.71f, 6.3f, 10.52f)
                curveTo(6.22f, 10.34f, 6.22f, 10.13f, 6.3f, 9.95f)
                curveTo(6.35f, 9.86f, 6.4f, 9.78f, 6.47f, 9.71f)
                lineTo(9.42f, 6.76f)
                curveTo(9.71f, 6.47f, 10.19f, 6.47f, 10.48f, 6.76f)
                curveTo(10.77f, 7.05f, 10.77f, 7.53f, 10.48f, 7.82f)
                lineTo(8.81f, 9.49f)
                horizontalLineTo(17f)
                curveTo(17.41f, 9.49f, 17.75f, 9.83f, 17.75f, 10.24f)
                curveTo(17.75f, 10.65f, 17.41f, 10.99f, 17f, 10.99f)
                close()
            }
        }.build()

        return _ArrowSwapHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSwapHorizontal: ImageVector? = null
