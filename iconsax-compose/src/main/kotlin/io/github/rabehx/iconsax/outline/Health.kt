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

val Iconsax.Outline.Health: ImageVector
    get() {
        if (_Health != null) {
            return _Health!!
        }
        _Health = ImageVector.Builder(
            name = "Outline.Health",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.97f, 22.75f)
                horizontalLineTo(8.97f)
                curveTo(3.54f, 22.75f, 1.22f, 20.43f, 1.22f, 15f)
                verticalLineTo(9f)
                curveTo(1.22f, 3.57f, 3.54f, 1.25f, 8.97f, 1.25f)
                horizontalLineTo(14.97f)
                curveTo(20.4f, 1.25f, 22.72f, 3.57f, 22.72f, 9f)
                verticalLineTo(15f)
                curveTo(22.72f, 20.43f, 20.41f, 22.75f, 14.97f, 22.75f)
                close()
                moveTo(8.97f, 2.75f)
                curveTo(4.36f, 2.75f, 2.72f, 4.39f, 2.72f, 9f)
                verticalLineTo(15f)
                curveTo(2.72f, 19.61f, 4.36f, 21.25f, 8.97f, 21.25f)
                horizontalLineTo(14.97f)
                curveTo(19.58f, 21.25f, 21.22f, 19.61f, 21.22f, 15f)
                verticalLineTo(9f)
                curveTo(21.22f, 4.39f, 19.58f, 2.75f, 14.97f, 2.75f)
                horizontalLineTo(8.97f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.45f, 18.06f)
                curveTo(11.21f, 18.06f, 10.63f, 17.97f, 10.29f, 17.1f)
                lineTo(9.15f, 14.22f)
                curveTo(8.99f, 13.81f, 8.42f, 13.43f, 7.99f, 13.43f)
                lineTo(1.99f, 13.45f)
                curveTo(1.58f, 13.45f, 1.24f, 13.12f, 1.24f, 12.7f)
                curveTo(1.24f, 12.29f, 1.57f, 11.95f, 1.99f, 11.95f)
                lineTo(7.99f, 11.93f)
                horizontalLineTo(8f)
                curveTo(9.05f, 11.93f, 10.17f, 12.69f, 10.56f, 13.67f)
                lineTo(11.47f, 15.97f)
                lineTo(13.53f, 10.75f)
                curveTo(13.84f, 9.97f, 14.39f, 9.86f, 14.62f, 9.84f)
                curveTo(14.85f, 9.83f, 15.41f, 9.88f, 15.8f, 10.62f)
                lineTo(16.84f, 12.59f)
                curveTo(17.02f, 12.93f, 17.56f, 13.26f, 17.95f, 13.26f)
                horizontalLineTo(22.01f)
                curveTo(22.42f, 13.26f, 22.76f, 13.6f, 22.76f, 14.01f)
                curveTo(22.76f, 14.42f, 22.42f, 14.76f, 22.01f, 14.76f)
                horizontalLineTo(17.95f)
                curveTo(17f, 14.76f, 15.96f, 14.13f, 15.52f, 13.29f)
                lineTo(14.74f, 11.81f)
                lineTo(12.64f, 17.1f)
                curveTo(12.27f, 17.96f, 11.68f, 18.06f, 11.45f, 18.06f)
                close()
            }
        }.build()

        return _Health!!
    }

@Suppress("ObjectPropertyName")
private var _Health: ImageVector? = null
