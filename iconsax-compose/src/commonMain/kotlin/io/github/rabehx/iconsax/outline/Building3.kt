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

val Iconsax.Outline.Building3: ImageVector
    get() {
        if (_Building3 != null) {
            return _Building3!!
        }
        _Building3 = ImageVector.Builder(
            name = "Outline.Building3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 22.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 22.75f, 1.25f, 22.41f, 1.25f, 22f)
                curveTo(1.25f, 21.59f, 1.59f, 21.25f, 2f, 21.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 21.25f, 22.75f, 21.59f, 22.75f, 22f)
                curveTo(22.75f, 22.41f, 22.41f, 22.75f, 22f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.01f, 22.76f)
                curveTo(2.81f, 22.76f, 2.62f, 22.68f, 2.48f, 22.54f)
                curveTo(2.34f, 22.4f, 2.26f, 22.21f, 2.26f, 22.01f)
                lineTo(2.25f, 7.07f)
                curveTo(2.25f, 6.16f, 2.71f, 5.3f, 3.47f, 4.79f)
                lineTo(7.47f, 2.12f)
                curveTo(8.4f, 1.5f, 9.6f, 1.5f, 10.52f, 2.12f)
                lineTo(14.52f, 4.79f)
                curveTo(15.29f, 5.3f, 15.74f, 6.15f, 15.74f, 7.07f)
                lineTo(15.75f, 21.99f)
                curveTo(15.75f, 22.4f, 15.42f, 22.74f, 15f, 22.74f)
                lineTo(3.01f, 22.76f)
                close()
                moveTo(9f, 3.15f)
                curveTo(8.76f, 3.15f, 8.52f, 3.22f, 8.31f, 3.36f)
                lineTo(4.31f, 6.03f)
                curveTo(3.96f, 6.26f, 3.75f, 6.65f, 3.75f, 7.07f)
                lineTo(3.76f, 21.26f)
                lineTo(14.26f, 21.24f)
                lineTo(14.25f, 7.07f)
                curveTo(14.25f, 6.65f, 14.04f, 6.26f, 13.7f, 6.04f)
                lineTo(9.7f, 3.37f)
                curveTo(9.49f, 3.22f, 9.24f, 3.15f, 9f, 3.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.98f, 22.76f)
                curveTo(19.57f, 22.76f, 19.23f, 22.42f, 19.23f, 22.01f)
                verticalLineTo(18f)
                curveTo(19.23f, 17.59f, 19.57f, 17.25f, 19.98f, 17.25f)
                curveTo(20.39f, 17.25f, 20.73f, 17.59f, 20.73f, 18f)
                verticalLineTo(22.01f)
                curveTo(20.73f, 22.42f, 20.4f, 22.76f, 19.98f, 22.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 18.75f)
                curveTo(18.48f, 18.75f, 17.25f, 17.52f, 17.25f, 16f)
                verticalLineTo(14f)
                curveTo(17.25f, 12.48f, 18.48f, 11.25f, 20f, 11.25f)
                curveTo(21.52f, 11.25f, 22.75f, 12.48f, 22.75f, 14f)
                verticalLineTo(16f)
                curveTo(22.75f, 17.52f, 21.52f, 18.75f, 20f, 18.75f)
                close()
                moveTo(20f, 12.75f)
                curveTo(19.31f, 12.75f, 18.75f, 13.31f, 18.75f, 14f)
                verticalLineTo(16f)
                curveTo(18.75f, 16.69f, 19.31f, 17.25f, 20f, 17.25f)
                curveTo(20.69f, 17.25f, 21.25f, 16.69f, 21.25f, 16f)
                verticalLineTo(14f)
                curveTo(21.25f, 13.31f, 20.69f, 12.75f, 20f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 14.75f)
                horizontalLineTo(3f)
                curveTo(2.59f, 14.75f, 2.25f, 14.41f, 2.25f, 14f)
                curveTo(2.25f, 13.59f, 2.59f, 13.25f, 3f, 13.25f)
                horizontalLineTo(15f)
                curveTo(15.41f, 13.25f, 15.75f, 13.59f, 15.75f, 14f)
                curveTo(15.75f, 14.41f, 15.41f, 14.75f, 15f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 22.75f)
                curveTo(8.59f, 22.75f, 8.25f, 22.41f, 8.25f, 22f)
                verticalLineTo(18.25f)
                curveTo(8.25f, 17.84f, 8.59f, 17.5f, 9f, 17.5f)
                curveTo(9.41f, 17.5f, 9.75f, 17.84f, 9.75f, 18.25f)
                verticalLineTo(22f)
                curveTo(9.75f, 22.41f, 9.41f, 22.75f, 9f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 11.25f)
                curveTo(7.76f, 11.25f, 6.75f, 10.24f, 6.75f, 9f)
                curveTo(6.75f, 7.76f, 7.76f, 6.75f, 9f, 6.75f)
                curveTo(10.24f, 6.75f, 11.25f, 7.76f, 11.25f, 9f)
                curveTo(11.25f, 10.24f, 10.24f, 11.25f, 9f, 11.25f)
                close()
                moveTo(9f, 8.25f)
                curveTo(8.59f, 8.25f, 8.25f, 8.59f, 8.25f, 9f)
                curveTo(8.25f, 9.41f, 8.59f, 9.75f, 9f, 9.75f)
                curveTo(9.41f, 9.75f, 9.75f, 9.41f, 9.75f, 9f)
                curveTo(9.75f, 8.59f, 9.41f, 8.25f, 9f, 8.25f)
                close()
            }
        }.build()

        return _Building3!!
    }

@Suppress("ObjectPropertyName")
private var _Building3: ImageVector? = null
