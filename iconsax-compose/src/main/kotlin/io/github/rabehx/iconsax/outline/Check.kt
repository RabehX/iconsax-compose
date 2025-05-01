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

val Iconsax.Outline.Check: ImageVector
    get() {
        if (_Check != null) {
            return _Check!!
        }
        _Check = ImageVector.Builder(
            name = "Outline.Check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.02f, 20.25f)
                horizontalLineTo(7.5f)
                curveTo(6.75f, 20.25f, 6.2f, 20.22f, 5.73f, 20.15f)
                curveTo(2.4f, 19.78f, 1.75f, 17.8f, 1.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(1.75f, 6.2f, 2.41f, 4.21f, 5.76f, 3.84f)
                curveTo(6.2f, 3.78f, 6.75f, 3.75f, 7.5f, 3.75f)
                horizontalLineTo(10.96f)
                curveTo(11.37f, 3.75f, 11.71f, 4.09f, 11.71f, 4.5f)
                curveTo(11.71f, 4.91f, 11.37f, 5.25f, 10.96f, 5.25f)
                horizontalLineTo(7.5f)
                curveTo(6.82f, 5.25f, 6.34f, 5.28f, 5.95f, 5.33f)
                curveTo(3.92f, 5.55f, 3.25f, 6.19f, 3.25f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(3.25f, 17.81f, 3.92f, 18.44f, 5.92f, 18.67f)
                curveTo(6.34f, 18.73f, 6.82f, 18.75f, 7.5f, 18.75f)
                horizontalLineTo(11.02f)
                curveTo(11.43f, 18.75f, 11.77f, 19.09f, 11.77f, 19.5f)
                curveTo(11.77f, 19.91f, 11.43f, 20.25f, 11.02f, 20.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 20.25f)
                horizontalLineTo(15.019f)
                curveTo(14.609f, 20.25f, 14.269f, 19.91f, 14.269f, 19.5f)
                curveTo(14.269f, 19.09f, 14.609f, 18.75f, 15.019f, 18.75f)
                horizontalLineTo(16.5f)
                curveTo(17.18f, 18.75f, 17.66f, 18.72f, 18.049f, 18.67f)
                curveTo(20.08f, 18.45f, 20.75f, 17.81f, 20.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(20.75f, 6.19f, 20.08f, 5.56f, 18.08f, 5.33f)
                curveTo(17.66f, 5.27f, 17.18f, 5.25f, 16.5f, 5.25f)
                horizontalLineTo(15.019f)
                curveTo(14.609f, 5.25f, 14.269f, 4.91f, 14.269f, 4.5f)
                curveTo(14.269f, 4.09f, 14.609f, 3.75f, 15.019f, 3.75f)
                horizontalLineTo(16.5f)
                curveTo(17.25f, 3.75f, 17.799f, 3.78f, 18.27f, 3.85f)
                curveTo(21.6f, 4.22f, 22.25f, 6.2f, 22.25f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(22.25f, 17.8f, 21.59f, 19.79f, 18.24f, 20.16f)
                curveTo(17.799f, 20.22f, 17.25f, 20.25f, 16.5f, 20.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                curveTo(14.59f, 22.75f, 14.25f, 22.41f, 14.25f, 22f)
                verticalLineTo(2f)
                curveTo(14.25f, 1.59f, 14.59f, 1.25f, 15f, 1.25f)
                curveTo(15.41f, 1.25f, 15.75f, 1.59f, 15.75f, 2f)
                verticalLineTo(22f)
                curveTo(15.75f, 22.41f, 15.41f, 22.75f, 15f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 16.25f)
                curveTo(7.59f, 16.25f, 7.25f, 15.91f, 7.25f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(7.25f, 8.09f, 7.59f, 7.75f, 8f, 7.75f)
                curveTo(8.41f, 7.75f, 8.75f, 8.09f, 8.75f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(8.75f, 15.91f, 8.41f, 16.25f, 8f, 16.25f)
                close()
            }
        }.build()

        return _Check!!
    }

@Suppress("ObjectPropertyName")
private var _Check: ImageVector? = null
