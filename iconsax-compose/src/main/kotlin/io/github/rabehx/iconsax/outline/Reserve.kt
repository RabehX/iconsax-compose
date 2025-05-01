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

val Iconsax.Outline.Reserve: ImageVector
    get() {
        if (_Reserve != null) {
            return _Reserve!!
        }
        _Reserve = ImageVector.Builder(
            name = "Outline.Reserve",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.971f, 22.75f)
                horizontalLineTo(4.971f)
                curveTo(1.221f, 22.75f, 1.221f, 20.67f, 1.221f, 19f)
                verticalLineTo(18f)
                curveTo(1.221f, 17.04f, 2.011f, 16.25f, 2.971f, 16.25f)
                horizontalLineTo(20.971f)
                curveTo(21.931f, 16.25f, 22.721f, 17.04f, 22.721f, 18f)
                verticalLineTo(19f)
                curveTo(22.721f, 20.67f, 22.721f, 22.75f, 18.971f, 22.75f)
                close()
                moveTo(2.971f, 17.75f)
                curveTo(2.831f, 17.75f, 2.721f, 17.86f, 2.721f, 18f)
                verticalLineTo(19f)
                curveTo(2.721f, 20.64f, 2.721f, 21.25f, 4.971f, 21.25f)
                horizontalLineTo(18.971f)
                curveTo(21.221f, 21.25f, 21.221f, 20.64f, 21.221f, 19f)
                verticalLineTo(18f)
                curveTo(21.221f, 17.86f, 21.111f, 17.75f, 20.971f, 17.75f)
                horizontalLineTo(2.971f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.719f, 17.75f)
                horizontalLineTo(3.27f)
                curveTo(2.86f, 17.75f, 2.52f, 17.41f, 2.52f, 17f)
                verticalLineTo(13f)
                curveTo(2.52f, 8.9f, 5.43f, 5.3f, 9.43f, 4.45f)
                curveTo(10.019f, 4.32f, 10.639f, 4.25f, 11.269f, 4.25f)
                horizontalLineTo(12.719f)
                curveTo(13.359f, 4.25f, 13.979f, 4.32f, 14.569f, 4.45f)
                curveTo(18.569f, 5.31f, 21.469f, 8.91f, 21.469f, 13f)
                verticalLineTo(17f)
                curveTo(21.469f, 17.41f, 21.139f, 17.75f, 20.719f, 17.75f)
                close()
                moveTo(4.02f, 16.25f)
                horizontalLineTo(19.969f)
                verticalLineTo(13f)
                curveTo(19.969f, 9.61f, 17.569f, 6.63f, 14.25f, 5.91f)
                curveTo(13.759f, 5.8f, 13.25f, 5.75f, 12.719f, 5.75f)
                horizontalLineTo(11.269f)
                curveTo(10.75f, 5.75f, 10.24f, 5.8f, 9.75f, 5.91f)
                curveTo(6.43f, 6.62f, 4.02f, 9.6f, 4.02f, 13f)
                verticalLineTo(16.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.59f, 5.93f)
                curveTo(9.26f, 5.93f, 8.96f, 5.71f, 8.87f, 5.38f)
                curveTo(8.79f, 5.09f, 8.75f, 4.8f, 8.75f, 4.5f)
                curveTo(8.75f, 2.71f, 10.21f, 1.25f, 12f, 1.25f)
                curveTo(13.79f, 1.25f, 15.25f, 2.71f, 15.25f, 4.5f)
                curveTo(15.25f, 4.8f, 15.21f, 5.09f, 15.13f, 5.38f)
                curveTo(15.03f, 5.76f, 14.65f, 6f, 14.25f, 5.91f)
                curveTo(13.76f, 5.8f, 13.25f, 5.75f, 12.72f, 5.75f)
                horizontalLineTo(11.27f)
                curveTo(10.75f, 5.75f, 10.24f, 5.8f, 9.75f, 5.91f)
                curveTo(9.7f, 5.92f, 9.65f, 5.93f, 9.59f, 5.93f)
                close()
                moveTo(11.27f, 4.25f)
                horizontalLineTo(12.72f)
                curveTo(13.06f, 4.25f, 13.41f, 4.27f, 13.74f, 4.31f)
                curveTo(13.65f, 3.43f, 12.9f, 2.75f, 12f, 2.75f)
                curveTo(11.1f, 2.75f, 10.36f, 3.43f, 10.26f, 4.31f)
                curveTo(10.6f, 4.27f, 10.93f, 4.25f, 11.27f, 4.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 11.75f)
                horizontalLineTo(9f)
                curveTo(8.59f, 11.75f, 8.25f, 11.41f, 8.25f, 11f)
                curveTo(8.25f, 10.59f, 8.59f, 10.25f, 9f, 10.25f)
                horizontalLineTo(15f)
                curveTo(15.41f, 10.25f, 15.75f, 10.59f, 15.75f, 11f)
                curveTo(15.75f, 11.41f, 15.41f, 11.75f, 15f, 11.75f)
                close()
            }
        }.build()

        return _Reserve!!
    }

@Suppress("ObjectPropertyName")
private var _Reserve: ImageVector? = null
