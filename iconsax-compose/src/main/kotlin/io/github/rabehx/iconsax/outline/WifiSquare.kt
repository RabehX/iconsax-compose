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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.WifiSquare: ImageVector
    get() {
        if (_WifiSquare != null) {
            return _WifiSquare!!
        }
        _WifiSquare = ImageVector.Builder(
            name = "Outline.WifiSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 10.71f)
                curveTo(17.84f, 10.71f, 17.681f, 10.66f, 17.541f, 10.55f)
                curveTo(14.17f, 7.95f, 9.821f, 7.95f, 6.461f, 10.55f)
                curveTo(6.131f, 10.8f, 5.661f, 10.74f, 5.411f, 10.42f)
                curveTo(5.161f, 10.09f, 5.221f, 9.62f, 5.541f, 9.37f)
                curveTo(9.461f, 6.34f, 14.531f, 6.34f, 18.461f, 9.37f)
                curveTo(18.791f, 9.62f, 18.851f, 10.09f, 18.59f, 10.42f)
                curveTo(18.451f, 10.61f, 18.221f, 10.71f, 18f, 10.71f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.4f, 13.8f)
                curveTo(16.24f, 13.8f, 16.08f, 13.75f, 15.94f, 13.64f)
                curveTo(13.54f, 11.79f, 10.45f, 11.79f, 8.05f, 13.64f)
                curveTo(7.72f, 13.89f, 7.25f, 13.83f, 7f, 13.51f)
                curveTo(6.75f, 13.18f, 6.81f, 12.71f, 7.13f, 12.46f)
                curveTo(10.08f, 10.18f, 13.9f, 10.18f, 16.85f, 12.46f)
                curveTo(17.18f, 12.71f, 17.24f, 13.18f, 16.98f, 13.51f)
                curveTo(16.85f, 13.7f, 16.63f, 13.8f, 16.4f, 13.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.2f, 16.89f)
                curveTo(14.04f, 16.89f, 13.88f, 16.84f, 13.74f, 16.73f)
                curveTo(12.68f, 15.91f, 11.31f, 15.91f, 10.25f, 16.73f)
                curveTo(9.92f, 16.98f, 9.45f, 16.92f, 9.2f, 16.6f)
                curveTo(8.95f, 16.27f, 9.01f, 15.8f, 9.33f, 15.55f)
                curveTo(10.92f, 14.32f, 13.06f, 14.32f, 14.65f, 15.55f)
                curveTo(14.98f, 15.8f, 15.04f, 16.27f, 14.78f, 16.6f)
                curveTo(14.65f, 16.79f, 14.43f, 16.89f, 14.2f, 16.89f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _WifiSquare!!
    }

@Suppress("ObjectPropertyName")
private var _WifiSquare: ImageVector? = null
