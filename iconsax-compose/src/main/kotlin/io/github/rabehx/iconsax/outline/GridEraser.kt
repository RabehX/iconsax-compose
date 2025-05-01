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

val Iconsax.Outline.GridEraser: ImageVector
    get() {
        if (_GridEraser != null) {
            return _GridEraser!!
        }
        _GridEraser = ImageVector.Builder(
            name = "Outline.GridEraser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(11f)
                curveTo(22.75f, 11.41f, 22.41f, 11.75f, 22f, 11.75f)
                curveTo(21.59f, 11.75f, 21.25f, 11.41f, 21.25f, 11f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(10f)
                curveTo(10.41f, 21.25f, 10.75f, 21.59f, 10.75f, 22f)
                curveTo(10.75f, 22.41f, 10.41f, 22.75f, 10f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.001f, 9.25f)
                horizontalLineTo(2.031f)
                curveTo(1.621f, 9.25f, 1.281f, 8.91f, 1.281f, 8.5f)
                curveTo(1.281f, 8.09f, 1.621f, 7.75f, 2.031f, 7.75f)
                horizontalLineTo(22.001f)
                curveTo(22.411f, 7.75f, 22.751f, 8.09f, 22.751f, 8.5f)
                curveTo(22.751f, 8.91f, 22.411f, 9.25f, 22.001f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.001f, 16.25f)
                horizontalLineTo(2.031f)
                curveTo(1.621f, 16.25f, 1.281f, 15.91f, 1.281f, 15.5f)
                curveTo(1.281f, 15.09f, 1.621f, 14.75f, 2.031f, 14.75f)
                horizontalLineTo(12.001f)
                curveTo(12.411f, 14.75f, 12.751f, 15.09f, 12.751f, 15.5f)
                curveTo(12.751f, 15.91f, 12.411f, 16.25f, 12.001f, 16.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.51f, 22.74f)
                curveTo(8.1f, 22.74f, 7.76f, 22.4f, 7.76f, 21.99f)
                verticalLineTo(2.02f)
                curveTo(7.76f, 1.61f, 8.1f, 1.27f, 8.51f, 1.27f)
                curveTo(8.92f, 1.27f, 9.26f, 1.61f, 9.26f, 2.02f)
                verticalLineTo(21.99f)
                curveTo(9.26f, 22.4f, 8.93f, 22.74f, 8.51f, 22.74f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.51f, 12.74f)
                curveTo(15.1f, 12.74f, 14.76f, 12.4f, 14.76f, 11.99f)
                verticalLineTo(2.02f)
                curveTo(14.76f, 1.61f, 15.1f, 1.27f, 15.51f, 1.27f)
                curveTo(15.92f, 1.27f, 16.26f, 1.61f, 16.26f, 2.02f)
                verticalLineTo(11.99f)
                curveTo(16.26f, 12.4f, 15.93f, 12.74f, 15.51f, 12.74f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.949f, 22.75f)
                curveTo(15.409f, 22.75f, 14.879f, 22.55f, 14.459f, 22.14f)
                lineTo(12.869f, 20.54f)
                curveTo(12.059f, 19.73f, 12.059f, 18.4f, 12.869f, 17.57f)
                lineTo(14.779f, 15.67f)
                curveTo(15.069f, 15.38f, 15.549f, 15.38f, 15.839f, 15.67f)
                lineTo(19.339f, 19.17f)
                curveTo(19.479f, 19.31f, 19.559f, 19.5f, 19.559f, 19.7f)
                curveTo(19.559f, 19.9f, 19.479f, 20.09f, 19.339f, 20.23f)
                lineTo(17.439f, 22.13f)
                curveTo(17.019f, 22.54f, 16.489f, 22.75f, 15.949f, 22.75f)
                close()
                moveTo(15.299f, 17.27f)
                lineTo(13.929f, 18.64f)
                curveTo(13.699f, 18.87f, 13.699f, 19.26f, 13.929f, 19.49f)
                lineTo(15.509f, 21.08f)
                curveTo(15.739f, 21.31f, 16.129f, 21.31f, 16.359f, 21.08f)
                lineTo(17.739f, 19.71f)
                lineTo(15.299f, 17.27f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.8f, 20.45f)
                curveTo(18.6f, 20.45f, 18.41f, 20.37f, 18.27f, 20.23f)
                lineTo(14.77f, 16.73f)
                curveTo(14.48f, 16.44f, 14.48f, 15.96f, 14.77f, 15.67f)
                lineTo(17.58f, 12.85f)
                curveTo(18.4f, 12.03f, 19.74f, 12.03f, 20.56f, 12.85f)
                lineTo(22.14f, 14.44f)
                curveTo(22.53f, 14.83f, 22.75f, 15.36f, 22.75f, 15.93f)
                curveTo(22.75f, 16.5f, 22.53f, 17.02f, 22.14f, 17.42f)
                lineTo(19.34f, 20.23f)
                curveTo(19.19f, 20.38f, 19f, 20.45f, 18.8f, 20.45f)
                close()
                moveTo(16.37f, 16.21f)
                lineTo(18.81f, 18.65f)
                lineTo(21.08f, 16.37f)
                curveTo(21.19f, 16.26f, 21.25f, 16.11f, 21.25f, 15.94f)
                curveTo(21.25f, 15.78f, 21.19f, 15.62f, 21.08f, 15.51f)
                lineTo(19.5f, 13.92f)
                curveTo(19.27f, 13.69f, 18.88f, 13.69f, 18.65f, 13.92f)
                lineTo(16.37f, 16.21f)
                close()
            }
        }.build()

        return _GridEraser!!
    }

@Suppress("ObjectPropertyName")
private var _GridEraser: ImageVector? = null
