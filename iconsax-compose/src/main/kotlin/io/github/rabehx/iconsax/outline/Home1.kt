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

val Iconsax.Outline.Home1: ImageVector
    get() {
        if (_Home1 != null) {
            return _Home1!!
        }
        _Home1 = ImageVector.Builder(
            name = "Outline.Home1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.6f, 22.56f)
                horizontalLineTo(6.4f)
                curveTo(4.58f, 22.56f, 2.92f, 21.16f, 2.62f, 19.36f)
                lineTo(1.29f, 11.4f)
                curveTo(1.08f, 10.16f, 1.68f, 8.57f, 2.67f, 7.78f)
                lineTo(9.6f, 2.23f)
                curveTo(10.94f, 1.15f, 13.05f, 1.16f, 14.4f, 2.24f)
                lineTo(21.33f, 7.78f)
                curveTo(22.31f, 8.57f, 22.91f, 10.16f, 22.71f, 11.4f)
                lineTo(21.38f, 19.36f)
                curveTo(21.08f, 21.13f, 19.39f, 22.56f, 17.6f, 22.56f)
                close()
                moveTo(11.99f, 2.94f)
                curveTo(11.46f, 2.94f, 10.93f, 3.1f, 10.54f, 3.41f)
                lineTo(3.61f, 8.96f)
                curveTo(3.04f, 9.42f, 2.65f, 10.44f, 2.77f, 11.16f)
                lineTo(4.1f, 19.12f)
                curveTo(4.28f, 20.17f, 5.33f, 21.06f, 6.4f, 21.06f)
                horizontalLineTo(17.6f)
                curveTo(18.67f, 21.06f, 19.72f, 20.17f, 19.9f, 19.11f)
                lineTo(21.23f, 11.15f)
                curveTo(21.35f, 10.43f, 20.95f, 9.4f, 20.39f, 8.95f)
                lineTo(13.46f, 3.41f)
                curveTo(13.06f, 3.1f, 12.53f, 2.94f, 11.99f, 2.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.25f)
                curveTo(10.21f, 16.25f, 8.75f, 14.79f, 8.75f, 13f)
                curveTo(8.75f, 11.21f, 10.21f, 9.75f, 12f, 9.75f)
                curveTo(13.79f, 9.75f, 15.25f, 11.21f, 15.25f, 13f)
                curveTo(15.25f, 14.79f, 13.79f, 16.25f, 12f, 16.25f)
                close()
                moveTo(12f, 11.25f)
                curveTo(11.04f, 11.25f, 10.25f, 12.04f, 10.25f, 13f)
                curveTo(10.25f, 13.96f, 11.04f, 14.75f, 12f, 14.75f)
                curveTo(12.96f, 14.75f, 13.75f, 13.96f, 13.75f, 13f)
                curveTo(13.75f, 12.04f, 12.96f, 11.25f, 12f, 11.25f)
                close()
            }
        }.build()

        return _Home1!!
    }

@Suppress("ObjectPropertyName")
private var _Home1: ImageVector? = null
