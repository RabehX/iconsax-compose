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


val Iconsax.Filled.MirroringScreen: ImageVector
    get() {
        if (_MirroringScreen != null) {
            return _MirroringScreen!!
        }
        _MirroringScreen = ImageVector.Builder(
            name = "Filled.MirroringScreen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 3f)
                horizontalLineTo(7f)
                curveTo(4.24f, 3f, 2f, 5.24f, 2f, 8f)
                verticalLineTo(9f)
                verticalLineTo(16f)
                curveTo(2f, 18.76f, 4.24f, 21f, 7f, 21f)
                horizontalLineTo(16f)
                horizontalLineTo(17f)
                curveTo(19.76f, 21f, 22f, 18.76f, 22f, 16f)
                verticalLineTo(8f)
                curveTo(22f, 5.24f, 19.76f, 3f, 17f, 3f)
                close()
                moveTo(10.49f, 16.81f)
                curveTo(10.46f, 16.81f, 10.43f, 16.82f, 10.39f, 16.82f)
                curveTo(10.02f, 16.82f, 9.7f, 16.54f, 9.65f, 16.17f)
                curveTo(9.52f, 15.15f, 8.78f, 14.41f, 7.76f, 14.28f)
                curveTo(7.35f, 14.23f, 7.06f, 13.85f, 7.11f, 13.44f)
                curveTo(7.16f, 13.03f, 7.54f, 12.74f, 7.95f, 12.79f)
                curveTo(9.64f, 13.01f, 10.92f, 14.29f, 11.14f, 15.98f)
                curveTo(11.19f, 16.38f, 10.9f, 16.76f, 10.49f, 16.81f)
                close()
                moveTo(13.54f, 16.3f)
                curveTo(13.51f, 16.3f, 13.48f, 16.31f, 13.44f, 16.31f)
                curveTo(13.07f, 16.31f, 12.75f, 16.03f, 12.7f, 15.66f)
                curveTo(12.39f, 13.28f, 10.66f, 11.54f, 8.27f, 11.23f)
                curveTo(7.86f, 11.18f, 7.57f, 10.8f, 7.62f, 10.39f)
                curveTo(7.67f, 9.98f, 8.05f, 9.69f, 8.46f, 9.74f)
                curveTo(11.54f, 10.14f, 13.79f, 12.38f, 14.19f, 15.47f)
                curveTo(14.24f, 15.87f, 13.95f, 16.24f, 13.54f, 16.3f)
                close()
                moveTo(16.24f, 15.43f)
                curveTo(16.21f, 15.43f, 16.18f, 15.44f, 16.14f, 15.44f)
                curveTo(15.77f, 15.44f, 15.45f, 15.16f, 15.4f, 14.79f)
                curveTo(14.97f, 11.41f, 12.51f, 8.95f, 9.13f, 8.52f)
                curveTo(8.72f, 8.47f, 8.43f, 8.09f, 8.48f, 7.68f)
                curveTo(8.53f, 7.27f, 8.91f, 6.98f, 9.32f, 7.03f)
                curveTo(13.39f, 7.55f, 16.36f, 10.52f, 16.89f, 14.6f)
                curveTo(16.94f, 15.01f, 16.65f, 15.38f, 16.24f, 15.43f)
                close()
            }
        }.build()

        return _MirroringScreen!!
    }

@Suppress("ObjectPropertyName")
private var _MirroringScreen: ImageVector? = null
