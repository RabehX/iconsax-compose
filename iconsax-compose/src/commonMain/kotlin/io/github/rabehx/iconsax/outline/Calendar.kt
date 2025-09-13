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

val Iconsax.Outline.Calendar: ImageVector
    get() {
        if (_Calendar != null) {
            return _Calendar!!
        }
        _Calendar = ImageVector.Builder(
            name = "Outline.Calendar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 5.75f)
                curveTo(7.59f, 5.75f, 7.25f, 5.41f, 7.25f, 5f)
                verticalLineTo(2f)
                curveTo(7.25f, 1.59f, 7.59f, 1.25f, 8f, 1.25f)
                curveTo(8.41f, 1.25f, 8.75f, 1.59f, 8.75f, 2f)
                verticalLineTo(5f)
                curveTo(8.75f, 5.41f, 8.41f, 5.75f, 8f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 5.75f)
                curveTo(15.59f, 5.75f, 15.25f, 5.41f, 15.25f, 5f)
                verticalLineTo(2f)
                curveTo(15.25f, 1.59f, 15.59f, 1.25f, 16f, 1.25f)
                curveTo(16.41f, 1.25f, 16.75f, 1.59f, 16.75f, 2f)
                verticalLineTo(5f)
                curveTo(16.75f, 5.41f, 16.41f, 5.75f, 16f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.38f, 22.75f, 2.25f, 20.1f, 2.25f, 15.82f)
                verticalLineTo(9.65f)
                curveTo(2.25f, 4.91f, 3.85f, 2.98f, 7.96f, 2.75f)
                horizontalLineTo(16f)
                curveTo(16.01f, 2.75f, 16.03f, 2.75f, 16.04f, 2.75f)
                curveTo(20.15f, 2.98f, 21.75f, 4.91f, 21.75f, 9.65f)
                verticalLineTo(15.82f)
                curveTo(21.75f, 20.1f, 20.62f, 22.75f, 15f, 22.75f)
                close()
                moveTo(8f, 4.25f)
                curveTo(5.2f, 4.41f, 3.75f, 5.29f, 3.75f, 9.65f)
                verticalLineTo(15.82f)
                curveTo(3.75f, 19.65f, 4.48f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.52f, 21.25f, 20.25f, 19.65f, 20.25f, 15.82f)
                verticalLineTo(9.65f)
                curveTo(20.25f, 5.3f, 18.81f, 4.41f, 15.98f, 4.25f)
                horizontalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.75f, 18.35f)
                horizontalLineTo(3.25f)
                curveTo(2.84f, 18.35f, 2.5f, 18.01f, 2.5f, 17.6f)
                curveTo(2.5f, 17.19f, 2.84f, 16.85f, 3.25f, 16.85f)
                horizontalLineTo(20.75f)
                curveTo(21.16f, 16.85f, 21.5f, 17.19f, 21.5f, 17.6f)
                curveTo(21.5f, 18.01f, 21.16f, 18.35f, 20.75f, 18.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 8.25f)
                curveTo(10.77f, 8.25f, 9.73f, 8.92f, 9.73f, 10.22f)
                curveTo(9.73f, 10.84f, 10.02f, 11.31f, 10.46f, 11.61f)
                curveTo(9.85f, 11.97f, 9.5f, 12.55f, 9.5f, 13.23f)
                curveTo(9.5f, 14.47f, 10.45f, 15.24f, 12f, 15.24f)
                curveTo(13.54f, 15.24f, 14.5f, 14.47f, 14.5f, 13.23f)
                curveTo(14.5f, 12.55f, 14.15f, 11.96f, 13.53f, 11.61f)
                curveTo(13.98f, 11.3f, 14.26f, 10.84f, 14.26f, 10.22f)
                curveTo(14.26f, 8.92f, 13.23f, 8.25f, 12f, 8.25f)
                close()
                moveTo(12f, 11.09f)
                curveTo(11.48f, 11.09f, 11.1f, 10.78f, 11.1f, 10.29f)
                curveTo(11.1f, 9.79f, 11.48f, 9.5f, 12f, 9.5f)
                curveTo(12.52f, 9.5f, 12.9f, 9.79f, 12.9f, 10.29f)
                curveTo(12.9f, 10.78f, 12.52f, 11.09f, 12f, 11.09f)
                close()
                moveTo(12f, 14f)
                curveTo(11.34f, 14f, 10.86f, 13.67f, 10.86f, 13.07f)
                curveTo(10.86f, 12.47f, 11.34f, 12.15f, 12f, 12.15f)
                curveTo(12.66f, 12.15f, 13.14f, 12.48f, 13.14f, 13.07f)
                curveTo(13.14f, 13.67f, 12.66f, 14f, 12f, 14f)
                close()
            }
        }.build()

        return _Calendar!!
    }

@Suppress("ObjectPropertyName")
private var _Calendar: ImageVector? = null
