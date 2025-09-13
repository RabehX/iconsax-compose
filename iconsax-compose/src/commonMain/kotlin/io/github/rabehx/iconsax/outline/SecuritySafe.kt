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

val Iconsax.Outline.SecuritySafe: ImageVector
    get() {
        if (_SecuritySafe != null) {
            return _SecuritySafe!!
        }
        _SecuritySafe = ImageVector.Builder(
            name = "Outline.SecuritySafe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.76f, 22.75f, 11.52f, 22.72f, 11.29f, 22.65f)
                curveTo(6.1f, 21.22f, 2.34f, 16.37f, 2.34f, 11.11f)
                verticalLineTo(6.72f)
                curveTo(2.34f, 5.6f, 3.15f, 4.39f, 4.19f, 3.96f)
                lineTo(9.76f, 1.68f)
                curveTo(11.21f, 1.09f, 12.8f, 1.09f, 14.24f, 1.68f)
                lineTo(19.81f, 3.96f)
                curveTo(20.85f, 4.39f, 21.66f, 5.6f, 21.66f, 6.72f)
                verticalLineTo(11.11f)
                curveTo(21.66f, 16.36f, 17.89f, 21.21f, 12.71f, 22.65f)
                curveTo(12.48f, 22.72f, 12.24f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(11.43f, 2.75f, 10.87f, 2.86f, 10.33f, 3.08f)
                lineTo(4.76f, 5.36f)
                curveTo(4.28f, 5.56f, 3.84f, 6.21f, 3.84f, 6.73f)
                verticalLineTo(11.12f)
                curveTo(3.84f, 15.71f, 7.14f, 19.95f, 11.69f, 21.21f)
                curveTo(11.89f, 21.27f, 12.11f, 21.27f, 12.31f, 21.21f)
                curveTo(16.86f, 19.95f, 20.16f, 15.71f, 20.16f, 11.12f)
                verticalLineTo(6.73f)
                curveTo(20.16f, 6.21f, 19.72f, 5.56f, 19.24f, 5.36f)
                lineTo(13.67f, 3.08f)
                curveTo(13.13f, 2.86f, 12.57f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 13.25f)
                curveTo(10.48f, 13.25f, 9.25f, 12.02f, 9.25f, 10.5f)
                curveTo(9.25f, 8.98f, 10.48f, 7.75f, 12f, 7.75f)
                curveTo(13.52f, 7.75f, 14.75f, 8.98f, 14.75f, 10.5f)
                curveTo(14.75f, 12.02f, 13.52f, 13.25f, 12f, 13.25f)
                close()
                moveTo(12f, 9.25f)
                curveTo(11.31f, 9.25f, 10.75f, 9.81f, 10.75f, 10.5f)
                curveTo(10.75f, 11.19f, 11.31f, 11.75f, 12f, 11.75f)
                curveTo(12.69f, 11.75f, 13.25f, 11.19f, 13.25f, 10.5f)
                curveTo(13.25f, 9.81f, 12.69f, 9.25f, 12f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.25f)
                curveTo(11.59f, 16.25f, 11.25f, 15.91f, 11.25f, 15.5f)
                verticalLineTo(12.5f)
                curveTo(11.25f, 12.09f, 11.59f, 11.75f, 12f, 11.75f)
                curveTo(12.41f, 11.75f, 12.75f, 12.09f, 12.75f, 12.5f)
                verticalLineTo(15.5f)
                curveTo(12.75f, 15.91f, 12.41f, 16.25f, 12f, 16.25f)
                close()
            }
        }.build()

        return _SecuritySafe!!
    }

@Suppress("ObjectPropertyName")
private var _SecuritySafe: ImageVector? = null
