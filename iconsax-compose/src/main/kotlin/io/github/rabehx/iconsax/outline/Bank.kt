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

val Iconsax.Outline.Bank: ImageVector
    get() {
        if (_Bank != null) {
            return _Bank!!
        }
        _Bank = ImageVector.Builder(
            name = "Outline.Bank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 11.75f)
                horizontalLineTo(3f)
                curveTo(2.04f, 11.75f, 1.25f, 10.96f, 1.25f, 10f)
                verticalLineTo(6.68f)
                curveTo(1.25f, 6f, 1.72f, 5.31f, 2.35f, 5.06f)
                lineTo(11.35f, 1.46f)
                curveTo(11.73f, 1.31f, 12.27f, 1.31f, 12.65f, 1.46f)
                lineTo(21.65f, 5.06f)
                curveTo(22.28f, 5.31f, 22.75f, 6.01f, 22.75f, 6.68f)
                verticalLineTo(10f)
                curveTo(22.75f, 10.96f, 21.96f, 11.75f, 21f, 11.75f)
                close()
                moveTo(12f, 2.84f)
                curveTo(11.96f, 2.84f, 11.92f, 2.84f, 11.9f, 2.85f)
                lineTo(2.91f, 6.45f)
                curveTo(2.85f, 6.48f, 2.75f, 6.61f, 2.75f, 6.68f)
                verticalLineTo(10f)
                curveTo(2.75f, 10.14f, 2.86f, 10.25f, 3f, 10.25f)
                horizontalLineTo(21f)
                curveTo(21.14f, 10.25f, 21.25f, 10.14f, 21.25f, 10f)
                verticalLineTo(6.68f)
                curveTo(21.25f, 6.61f, 21.16f, 6.48f, 21.09f, 6.45f)
                lineTo(12.09f, 2.85f)
                curveTo(12.07f, 2.84f, 12.04f, 2.84f, 12f, 2.84f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 22.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 22.75f, 1.25f, 22.41f, 1.25f, 22f)
                verticalLineTo(19f)
                curveTo(1.25f, 18.04f, 2.04f, 17.25f, 3f, 17.25f)
                horizontalLineTo(21f)
                curveTo(21.96f, 17.25f, 22.75f, 18.04f, 22.75f, 19f)
                verticalLineTo(22f)
                curveTo(22.75f, 22.41f, 22.41f, 22.75f, 22f, 22.75f)
                close()
                moveTo(2.75f, 21.25f)
                horizontalLineTo(21.25f)
                verticalLineTo(19f)
                curveTo(21.25f, 18.86f, 21.14f, 18.75f, 21f, 18.75f)
                horizontalLineTo(3f)
                curveTo(2.86f, 18.75f, 2.75f, 18.86f, 2.75f, 19f)
                verticalLineTo(21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 18.75f)
                curveTo(3.59f, 18.75f, 3.25f, 18.41f, 3.25f, 18f)
                verticalLineTo(11f)
                curveTo(3.25f, 10.59f, 3.59f, 10.25f, 4f, 10.25f)
                curveTo(4.41f, 10.25f, 4.75f, 10.59f, 4.75f, 11f)
                verticalLineTo(18f)
                curveTo(4.75f, 18.41f, 4.41f, 18.75f, 4f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 18.75f)
                curveTo(7.59f, 18.75f, 7.25f, 18.41f, 7.25f, 18f)
                verticalLineTo(11f)
                curveTo(7.25f, 10.59f, 7.59f, 10.25f, 8f, 10.25f)
                curveTo(8.41f, 10.25f, 8.75f, 10.59f, 8.75f, 11f)
                verticalLineTo(18f)
                curveTo(8.75f, 18.41f, 8.41f, 18.75f, 8f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.75f)
                curveTo(11.59f, 18.75f, 11.25f, 18.41f, 11.25f, 18f)
                verticalLineTo(11f)
                curveTo(11.25f, 10.59f, 11.59f, 10.25f, 12f, 10.25f)
                curveTo(12.41f, 10.25f, 12.75f, 10.59f, 12.75f, 11f)
                verticalLineTo(18f)
                curveTo(12.75f, 18.41f, 12.41f, 18.75f, 12f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 18.75f)
                curveTo(15.59f, 18.75f, 15.25f, 18.41f, 15.25f, 18f)
                verticalLineTo(11f)
                curveTo(15.25f, 10.59f, 15.59f, 10.25f, 16f, 10.25f)
                curveTo(16.41f, 10.25f, 16.75f, 10.59f, 16.75f, 11f)
                verticalLineTo(18f)
                curveTo(16.75f, 18.41f, 16.41f, 18.75f, 16f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 18.75f)
                curveTo(19.59f, 18.75f, 19.25f, 18.41f, 19.25f, 18f)
                verticalLineTo(11f)
                curveTo(19.25f, 10.59f, 19.59f, 10.25f, 20f, 10.25f)
                curveTo(20.41f, 10.25f, 20.75f, 10.59f, 20.75f, 11f)
                verticalLineTo(18f)
                curveTo(20.75f, 18.41f, 20.41f, 18.75f, 20f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(23f, 22.75f)
                horizontalLineTo(1f)
                curveTo(0.59f, 22.75f, 0.25f, 22.41f, 0.25f, 22f)
                curveTo(0.25f, 21.59f, 0.59f, 21.25f, 1f, 21.25f)
                horizontalLineTo(23f)
                curveTo(23.41f, 21.25f, 23.75f, 21.59f, 23.75f, 22f)
                curveTo(23.75f, 22.41f, 23.41f, 22.75f, 23f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 9.25f)
                curveTo(10.76f, 9.25f, 9.75f, 8.24f, 9.75f, 7f)
                curveTo(9.75f, 5.76f, 10.76f, 4.75f, 12f, 4.75f)
                curveTo(13.24f, 4.75f, 14.25f, 5.76f, 14.25f, 7f)
                curveTo(14.25f, 8.24f, 13.24f, 9.25f, 12f, 9.25f)
                close()
                moveTo(12f, 6.25f)
                curveTo(11.59f, 6.25f, 11.25f, 6.59f, 11.25f, 7f)
                curveTo(11.25f, 7.41f, 11.59f, 7.75f, 12f, 7.75f)
                curveTo(12.41f, 7.75f, 12.75f, 7.41f, 12.75f, 7f)
                curveTo(12.75f, 6.59f, 12.41f, 6.25f, 12f, 6.25f)
                close()
            }
        }.build()

        return _Bank!!
    }

@Suppress("ObjectPropertyName")
private var _Bank: ImageVector? = null
