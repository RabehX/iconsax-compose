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

val Iconsax.Outline.DollarCircle: ImageVector
    get() {
        if (_DollarCircle != null) {
            return _DollarCircle!!
        }
        _DollarCircle = ImageVector.Builder(
            name = "Outline.DollarCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.4f, 17.42f)
                horizontalLineTo(10.89f)
                curveTo(9.25f, 17.42f, 7.92f, 16.04f, 7.92f, 14.34f)
                curveTo(7.92f, 13.93f, 8.26f, 13.59f, 8.67f, 13.59f)
                curveTo(9.08f, 13.59f, 9.42f, 13.93f, 9.42f, 14.34f)
                curveTo(9.42f, 15.21f, 10.08f, 15.92f, 10.89f, 15.92f)
                horizontalLineTo(13.4f)
                curveTo(14.05f, 15.92f, 14.59f, 15.34f, 14.59f, 14.64f)
                curveTo(14.59f, 13.77f, 14.28f, 13.6f, 13.77f, 13.42f)
                lineTo(9.74f, 12f)
                curveTo(8.96f, 11.73f, 7.91f, 11.15f, 7.91f, 9.36f)
                curveTo(7.91f, 7.82f, 9.12f, 6.58f, 10.6f, 6.58f)
                horizontalLineTo(13.11f)
                curveTo(14.75f, 6.58f, 16.08f, 7.96f, 16.08f, 9.66f)
                curveTo(16.08f, 10.07f, 15.74f, 10.41f, 15.33f, 10.41f)
                curveTo(14.92f, 10.41f, 14.58f, 10.07f, 14.58f, 9.66f)
                curveTo(14.58f, 8.79f, 13.92f, 8.08f, 13.11f, 8.08f)
                horizontalLineTo(10.6f)
                curveTo(9.95f, 8.08f, 9.41f, 8.66f, 9.41f, 9.36f)
                curveTo(9.41f, 10.23f, 9.72f, 10.4f, 10.23f, 10.58f)
                lineTo(14.26f, 12f)
                curveTo(15.04f, 12.27f, 16.09f, 12.85f, 16.09f, 14.64f)
                curveTo(16.08f, 16.17f, 14.88f, 17.42f, 13.4f, 17.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.75f)
                curveTo(11.59f, 18.75f, 11.25f, 18.41f, 11.25f, 18f)
                verticalLineTo(6f)
                curveTo(11.25f, 5.59f, 11.59f, 5.25f, 12f, 5.25f)
                curveTo(12.41f, 5.25f, 12.75f, 5.59f, 12.75f, 6f)
                verticalLineTo(18f)
                curveTo(12.75f, 18.41f, 12.41f, 18.75f, 12f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
        }.build()

        return _DollarCircle!!
    }

@Suppress("ObjectPropertyName")
private var _DollarCircle: ImageVector? = null
