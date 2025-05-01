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

val Iconsax.Outline.Archive: ImageVector
    get() {
        if (_Archive != null) {
            return _Archive!!
        }
        _Archive = ImageVector.Builder(
            name = "Outline.Archive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 15.25f)
                curveTo(17.59f, 15.25f, 17.25f, 14.91f, 17.25f, 14.5f)
                curveTo(17.25f, 13.81f, 16.69f, 13.25f, 16f, 13.25f)
                horizontalLineTo(8f)
                curveTo(7.31f, 13.25f, 6.75f, 13.81f, 6.75f, 14.5f)
                curveTo(6.75f, 14.91f, 6.41f, 15.25f, 6f, 15.25f)
                curveTo(5.59f, 15.25f, 5.25f, 14.91f, 5.25f, 14.5f)
                verticalLineTo(7.75f)
                curveTo(5.25f, 6.23f, 6.48f, 5f, 8f, 5f)
                horizontalLineTo(16f)
                curveTo(17.52f, 5f, 18.75f, 6.23f, 18.75f, 7.75f)
                verticalLineTo(14.5f)
                curveTo(18.75f, 14.91f, 18.41f, 15.25f, 18f, 15.25f)
                close()
                moveTo(8f, 11.75f)
                horizontalLineTo(16f)
                curveTo(16.45f, 11.75f, 16.88f, 11.86f, 17.25f, 12.05f)
                verticalLineTo(7.75f)
                curveTo(17.25f, 7.06f, 16.69f, 6.5f, 16f, 6.5f)
                horizontalLineTo(8f)
                curveTo(7.31f, 6.5f, 6.75f, 7.06f, 6.75f, 7.75f)
                verticalLineTo(12.05f)
                curveTo(7.12f, 11.86f, 7.55f, 11.75f, 8f, 11.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 16.5f)
                horizontalLineTo(18f)
                curveTo(17.59f, 16.5f, 17.25f, 16.16f, 17.25f, 15.75f)
                curveTo(17.25f, 15.34f, 17.59f, 15f, 18f, 15f)
                horizontalLineTo(19f)
                curveTo(19.41f, 15f, 19.75f, 15.34f, 19.75f, 15.75f)
                curveTo(19.75f, 16.16f, 19.41f, 16.5f, 19f, 16.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 16.5f)
                horizontalLineTo(5f)
                curveTo(4.59f, 16.5f, 4.25f, 16.16f, 4.25f, 15.75f)
                curveTo(4.25f, 15.34f, 4.59f, 15f, 5f, 15f)
                horizontalLineTo(6f)
                curveTo(6.41f, 15f, 6.75f, 15.34f, 6.75f, 15.75f)
                curveTo(6.75f, 16.16f, 6.41f, 16.5f, 6f, 16.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 14.75f)
                curveTo(17.59f, 14.75f, 17.25f, 14.41f, 17.25f, 14f)
                verticalLineTo(11f)
                curveTo(17.25f, 10.31f, 16.69f, 9.75f, 16f, 9.75f)
                horizontalLineTo(8f)
                curveTo(7.31f, 9.75f, 6.75f, 10.31f, 6.75f, 11f)
                verticalLineTo(14f)
                curveTo(6.75f, 14.41f, 6.41f, 14.75f, 6f, 14.75f)
                curveTo(5.59f, 14.75f, 5.25f, 14.41f, 5.25f, 14f)
                verticalLineTo(11f)
                curveTo(5.25f, 9.48f, 6.48f, 8.25f, 8f, 8.25f)
                horizontalLineTo(16f)
                curveTo(17.52f, 8.25f, 18.75f, 9.48f, 18.75f, 11f)
                verticalLineTo(14f)
                curveTo(18.75f, 14.41f, 18.41f, 14.75f, 18f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 19f)
                curveTo(10.47f, 19f, 9.18f, 17.93f, 8.84f, 16.5f)
                horizontalLineTo(6f)
                curveTo(5.59f, 16.5f, 5.25f, 16.16f, 5.25f, 15.75f)
                verticalLineTo(14.5f)
                curveTo(5.25f, 12.98f, 6.48f, 11.75f, 8f, 11.75f)
                horizontalLineTo(16f)
                curveTo(17.52f, 11.75f, 18.75f, 12.98f, 18.75f, 14.5f)
                verticalLineTo(15.75f)
                curveTo(18.75f, 16.16f, 18.41f, 16.5f, 18f, 16.5f)
                horizontalLineTo(15.16f)
                curveTo(14.82f, 17.93f, 13.53f, 19f, 12f, 19f)
                close()
                moveTo(6.75f, 15f)
                horizontalLineTo(9.5f)
                curveTo(9.91f, 15f, 10.25f, 15.34f, 10.25f, 15.75f)
                curveTo(10.25f, 16.71f, 11.04f, 17.5f, 12f, 17.5f)
                curveTo(12.96f, 17.5f, 13.75f, 16.71f, 13.75f, 15.75f)
                curveTo(13.75f, 15.34f, 14.09f, 15f, 14.5f, 15f)
                horizontalLineTo(17.25f)
                verticalLineTo(14.5f)
                curveTo(17.25f, 13.81f, 16.69f, 13.25f, 16f, 13.25f)
                horizontalLineTo(8f)
                curveTo(7.31f, 13.25f, 6.75f, 13.81f, 6.75f, 14.5f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _Archive!!
    }

@Suppress("ObjectPropertyName")
private var _Archive: ImageVector? = null
