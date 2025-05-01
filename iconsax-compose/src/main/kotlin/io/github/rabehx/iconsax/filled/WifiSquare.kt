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


val Iconsax.Filled.WifiSquare: ImageVector
    get() {
        if (_WifiSquare != null) {
            return _WifiSquare!!
        }
        _WifiSquare = ImageVector.Builder(
            name = "Filled.WifiSquare",
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
                moveTo(14.79f, 16.6f)
                curveTo(14.64f, 16.79f, 14.42f, 16.89f, 14.2f, 16.89f)
                curveTo(14.04f, 16.89f, 13.88f, 16.84f, 13.74f, 16.73f)
                curveTo(12.68f, 15.91f, 11.31f, 15.91f, 10.25f, 16.73f)
                curveTo(9.92f, 16.98f, 9.45f, 16.92f, 9.2f, 16.6f)
                curveTo(8.95f, 16.27f, 9.01f, 15.8f, 9.33f, 15.55f)
                curveTo(10.92f, 14.32f, 13.06f, 14.32f, 14.65f, 15.55f)
                curveTo(14.99f, 15.8f, 15.05f, 16.27f, 14.79f, 16.6f)
                close()
                moveTo(17f, 13.51f)
                curveTo(16.85f, 13.7f, 16.63f, 13.8f, 16.41f, 13.8f)
                curveTo(16.25f, 13.8f, 16.09f, 13.75f, 15.95f, 13.64f)
                curveTo(13.55f, 11.79f, 10.46f, 11.79f, 8.06f, 13.64f)
                curveTo(7.73f, 13.9f, 7.26f, 13.84f, 7f, 13.51f)
                curveTo(6.74f, 13.18f, 6.81f, 12.71f, 7.13f, 12.46f)
                curveTo(10.08f, 10.18f, 13.9f, 10.18f, 16.85f, 12.46f)
                curveTo(17.19f, 12.71f, 17.25f, 13.18f, 17f, 13.51f)
                close()
                moveTo(18.59f, 10.42f)
                curveTo(18.44f, 10.61f, 18.22f, 10.71f, 18f, 10.71f)
                curveTo(17.84f, 10.71f, 17.68f, 10.66f, 17.54f, 10.55f)
                curveTo(14.17f, 7.95f, 9.82f, 7.95f, 6.46f, 10.55f)
                curveTo(6.13f, 10.8f, 5.66f, 10.74f, 5.41f, 10.42f)
                curveTo(5.16f, 10.09f, 5.22f, 9.62f, 5.54f, 9.37f)
                curveTo(9.46f, 6.34f, 14.53f, 6.34f, 18.46f, 9.37f)
                curveTo(18.79f, 9.62f, 18.85f, 10.09f, 18.59f, 10.42f)
                close()
            }
        }.build()

        return _WifiSquare!!
    }

@Suppress("ObjectPropertyName")
private var _WifiSquare: ImageVector? = null
