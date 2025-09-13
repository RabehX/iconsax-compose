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


val Iconsax.Filled.KeySquare: ImageVector
    get() {
        if (_KeySquare != null) {
            return _KeySquare!!
        }
        _KeySquare = ImageVector.Builder(
            name = "Filled.KeySquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.25f, 12f)
                curveTo(13.94f, 12f, 14.5f, 11.44f, 14.5f, 10.75f)
                curveTo(14.5f, 10.06f, 13.94f, 9.5f, 13.25f, 9.5f)
                curveTo(12.56f, 9.5f, 12f, 10.06f, 12f, 10.75f)
                curveTo(12f, 11.44f, 12.56f, 12f, 13.25f, 12f)
                close()
            }
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
                moveTo(15.89f, 13.47f)
                curveTo(14.86f, 14.49f, 13.39f, 14.81f, 12.09f, 14.4f)
                lineTo(11.03f, 15.45f)
                curveTo(10.94f, 15.54f, 10.78f, 15.54f, 10.68f, 15.45f)
                lineTo(9.71f, 14.48f)
                curveTo(9.57f, 14.34f, 9.33f, 14.34f, 9.18f, 14.48f)
                curveTo(9.03f, 14.62f, 9.04f, 14.86f, 9.18f, 15.01f)
                lineTo(10.15f, 15.98f)
                curveTo(10.25f, 16.08f, 10.25f, 16.24f, 10.15f, 16.33f)
                lineTo(9.74f, 16.74f)
                curveTo(9.57f, 16.92f, 9.24f, 17.03f, 9f, 17f)
                lineTo(7.91f, 16.85f)
                curveTo(7.55f, 16.8f, 7.22f, 16.46f, 7.16f, 16.1f)
                lineTo(7.01f, 15.01f)
                curveTo(6.97f, 14.77f, 7.09f, 14.44f, 7.25f, 14.27f)
                lineTo(9.6f, 11.92f)
                curveTo(9.2f, 10.62f, 9.51f, 9.15f, 10.54f, 8.12f)
                curveTo(12.01f, 6.65f, 14.41f, 6.65f, 15.89f, 8.12f)
                curveTo(17.37f, 9.59f, 17.37f, 11.99f, 15.89f, 13.47f)
                close()
            }
        }.build()

        return _KeySquare!!
    }

@Suppress("ObjectPropertyName")
private var _KeySquare: ImageVector? = null
