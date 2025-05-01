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

val Iconsax.Outline.Edit2: ImageVector
    get() {
        if (_Edit2 != null) {
            return _Edit2!!
        }
        _Edit2 = ImageVector.Builder(
            name = "Outline.Edit2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.54f, 19.52f)
                curveTo(4.93f, 19.52f, 4.36f, 19.31f, 3.95f, 18.92f)
                curveTo(3.43f, 18.43f, 3.18f, 17.69f, 3.27f, 16.89f)
                lineTo(3.64f, 13.65f)
                curveTo(3.71f, 13.04f, 4.08f, 12.23f, 4.51f, 11.79f)
                lineTo(12.72f, 3.1f)
                curveTo(14.77f, 0.93f, 16.91f, 0.87f, 19.08f, 2.92f)
                curveTo(21.25f, 4.97f, 21.31f, 7.11f, 19.26f, 9.28f)
                lineTo(11.05f, 17.97f)
                curveTo(10.63f, 18.42f, 9.85f, 18.84f, 9.24f, 18.94f)
                lineTo(6.02f, 19.49f)
                curveTo(5.85f, 19.5f, 5.7f, 19.52f, 5.54f, 19.52f)
                close()
                moveTo(15.93f, 2.91f)
                curveTo(15.16f, 2.91f, 14.49f, 3.39f, 13.81f, 4.11f)
                lineTo(5.6f, 12.81f)
                curveTo(5.4f, 13.02f, 5.17f, 13.52f, 5.13f, 13.81f)
                lineTo(4.76f, 17.05f)
                curveTo(4.72f, 17.38f, 4.8f, 17.65f, 4.98f, 17.82f)
                curveTo(5.16f, 17.99f, 5.43f, 18.05f, 5.76f, 18f)
                lineTo(8.98f, 17.45f)
                curveTo(9.27f, 17.4f, 9.75f, 17.14f, 9.95f, 16.93f)
                lineTo(18.16f, 8.24f)
                curveTo(19.4f, 6.92f, 19.85f, 5.7f, 18.04f, 4f)
                curveTo(17.24f, 3.23f, 16.55f, 2.91f, 15.93f, 2.91f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.34f, 10.95f)
                curveTo(17.32f, 10.95f, 17.29f, 10.95f, 17.27f, 10.95f)
                curveTo(14.15f, 10.64f, 11.64f, 8.27f, 11.16f, 5.17f)
                curveTo(11.1f, 4.76f, 11.38f, 4.38f, 11.79f, 4.31f)
                curveTo(12.2f, 4.25f, 12.58f, 4.53f, 12.65f, 4.94f)
                curveTo(13.03f, 7.36f, 14.99f, 9.22f, 17.43f, 9.46f)
                curveTo(17.84f, 9.5f, 18.14f, 9.87f, 18.1f, 10.28f)
                curveTo(18.05f, 10.66f, 17.72f, 10.95f, 17.34f, 10.95f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 22.75f)
                horizontalLineTo(3f)
                curveTo(2.59f, 22.75f, 2.25f, 22.41f, 2.25f, 22f)
                curveTo(2.25f, 21.59f, 2.59f, 21.25f, 3f, 21.25f)
                horizontalLineTo(21f)
                curveTo(21.41f, 21.25f, 21.75f, 21.59f, 21.75f, 22f)
                curveTo(21.75f, 22.41f, 21.41f, 22.75f, 21f, 22.75f)
                close()
            }
        }.build()

        return _Edit2!!
    }

@Suppress("ObjectPropertyName")
private var _Edit2: ImageVector? = null
