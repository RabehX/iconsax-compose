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

val Iconsax.Outline.AttachSquare: ImageVector
    get() {
        if (_AttachSquare != null) {
            return _AttachSquare!!
        }
        _AttachSquare = ImageVector.Builder(
            name = "Outline.AttachSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.2f, 17.38f)
                curveTo(11.5f, 17.38f, 10.79f, 17.11f, 10.26f, 16.58f)
                curveTo(9.74f, 16.06f, 9.45f, 15.37f, 9.45f, 14.64f)
                curveTo(9.45f, 13.91f, 9.74f, 13.21f, 10.26f, 12.7f)
                lineTo(11.67f, 11.29f)
                curveTo(11.96f, 11f, 12.44f, 11f, 12.73f, 11.29f)
                curveTo(13.02f, 11.58f, 13.02f, 12.06f, 12.73f, 12.35f)
                lineTo(11.32f, 13.76f)
                curveTo(11.08f, 14f, 10.95f, 14.31f, 10.95f, 14.64f)
                curveTo(10.95f, 14.97f, 11.08f, 15.29f, 11.32f, 15.52f)
                curveTo(11.81f, 16.01f, 12.6f, 16.01f, 13.09f, 15.52f)
                lineTo(15.31f, 13.3f)
                curveTo(16.58f, 12.03f, 16.58f, 9.97f, 15.31f, 8.7f)
                curveTo(14.04f, 7.43f, 11.98f, 7.43f, 10.71f, 8.7f)
                lineTo(8.29f, 11.12f)
                curveTo(7.78f, 11.63f, 7.5f, 12.3f, 7.5f, 13.01f)
                curveTo(7.5f, 13.72f, 7.78f, 14.4f, 8.29f, 14.9f)
                curveTo(8.58f, 15.19f, 8.58f, 15.67f, 8.29f, 15.96f)
                curveTo(8f, 16.25f, 7.52f, 16.25f, 7.23f, 15.96f)
                curveTo(6.44f, 15.17f, 6.01f, 14.12f, 6.01f, 13f)
                curveTo(6.01f, 11.88f, 6.44f, 10.83f, 7.23f, 10.04f)
                lineTo(9.65f, 7.62f)
                curveTo(11.5f, 5.77f, 14.52f, 5.77f, 16.37f, 7.62f)
                curveTo(18.22f, 9.47f, 18.22f, 12.49f, 16.37f, 14.34f)
                lineTo(14.15f, 16.56f)
                curveTo(13.61f, 17.11f, 12.91f, 17.38f, 12.2f, 17.38f)
                close()
            }
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
        }.build()

        return _AttachSquare!!
    }

@Suppress("ObjectPropertyName")
private var _AttachSquare: ImageVector? = null
