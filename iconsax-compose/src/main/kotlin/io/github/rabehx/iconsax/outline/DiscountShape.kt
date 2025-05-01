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

val Iconsax.Outline.DiscountShape: ImageVector
    get() {
        if (_DiscountShape != null) {
            return _DiscountShape!!
        }
        _DiscountShape = ImageVector.Builder(
            name = "Outline.DiscountShape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.37f, 22.75f, 10.78f, 22.51f, 10.34f, 22.06f)
                lineTo(8.82f, 20.54f)
                curveTo(8.7f, 20.42f, 8.38f, 20.29f, 8.22f, 20.29f)
                horizontalLineTo(6.06f)
                curveTo(4.76f, 20.29f, 3.71f, 19.24f, 3.71f, 17.94f)
                verticalLineTo(15.78f)
                curveTo(3.71f, 15.62f, 3.58f, 15.3f, 3.46f, 15.18f)
                lineTo(1.94f, 13.66f)
                curveTo(1.5f, 13.22f, 1.25f, 12.63f, 1.25f, 12f)
                curveTo(1.25f, 11.37f, 1.49f, 10.78f, 1.94f, 10.34f)
                lineTo(3.46f, 8.82f)
                curveTo(3.58f, 8.7f, 3.71f, 8.38f, 3.71f, 8.22f)
                verticalLineTo(6.06f)
                curveTo(3.71f, 4.76f, 4.76f, 3.71f, 6.06f, 3.71f)
                horizontalLineTo(8.22f)
                curveTo(8.38f, 3.71f, 8.7f, 3.58f, 8.82f, 3.46f)
                lineTo(10.34f, 1.94f)
                curveTo(11.22f, 1.06f, 12.78f, 1.06f, 13.66f, 1.94f)
                lineTo(15.18f, 3.46f)
                curveTo(15.3f, 3.58f, 15.62f, 3.71f, 15.78f, 3.71f)
                horizontalLineTo(17.94f)
                curveTo(19.24f, 3.71f, 20.29f, 4.76f, 20.29f, 6.06f)
                verticalLineTo(8.22f)
                curveTo(20.29f, 8.38f, 20.42f, 8.7f, 20.54f, 8.82f)
                lineTo(22.06f, 10.34f)
                curveTo(22.5f, 10.78f, 22.75f, 11.37f, 22.75f, 12f)
                curveTo(22.75f, 12.63f, 22.51f, 13.22f, 22.06f, 13.66f)
                lineTo(20.54f, 15.18f)
                curveTo(20.42f, 15.3f, 20.29f, 15.62f, 20.29f, 15.78f)
                verticalLineTo(17.94f)
                curveTo(20.29f, 19.24f, 19.24f, 20.29f, 17.94f, 20.29f)
                horizontalLineTo(15.78f)
                curveTo(15.62f, 20.29f, 15.3f, 20.42f, 15.18f, 20.54f)
                lineTo(13.66f, 22.06f)
                curveTo(13.22f, 22.51f, 12.63f, 22.75f, 12f, 22.75f)
                close()
                moveTo(4.52f, 14.12f)
                curveTo(4.92f, 14.52f, 5.21f, 15.22f, 5.21f, 15.78f)
                verticalLineTo(17.94f)
                curveTo(5.21f, 18.41f, 5.59f, 18.79f, 6.06f, 18.79f)
                horizontalLineTo(8.22f)
                curveTo(8.78f, 18.79f, 9.48f, 19.08f, 9.88f, 19.48f)
                lineTo(11.4f, 21f)
                curveTo(11.72f, 21.32f, 12.28f, 21.32f, 12.6f, 21f)
                lineTo(14.12f, 19.48f)
                curveTo(14.52f, 19.08f, 15.22f, 18.79f, 15.78f, 18.79f)
                horizontalLineTo(17.94f)
                curveTo(18.41f, 18.79f, 18.79f, 18.41f, 18.79f, 17.94f)
                verticalLineTo(15.78f)
                curveTo(18.79f, 15.22f, 19.08f, 14.52f, 19.48f, 14.12f)
                lineTo(21f, 12.6f)
                curveTo(21.16f, 12.44f, 21.25f, 12.23f, 21.25f, 12f)
                curveTo(21.25f, 11.77f, 21.16f, 11.56f, 21f, 11.4f)
                lineTo(19.48f, 9.88f)
                curveTo(19.08f, 9.48f, 18.79f, 8.78f, 18.79f, 8.22f)
                verticalLineTo(6.06f)
                curveTo(18.79f, 5.59f, 18.41f, 5.21f, 17.94f, 5.21f)
                horizontalLineTo(15.78f)
                curveTo(15.22f, 5.21f, 14.52f, 4.92f, 14.12f, 4.52f)
                lineTo(12.6f, 3f)
                curveTo(12.28f, 2.68f, 11.72f, 2.68f, 11.4f, 3f)
                lineTo(9.88f, 4.52f)
                curveTo(9.48f, 4.92f, 8.78f, 5.21f, 8.22f, 5.21f)
                horizontalLineTo(6.06f)
                curveTo(5.59f, 5.21f, 5.21f, 5.59f, 5.21f, 6.06f)
                verticalLineTo(8.22f)
                curveTo(5.21f, 8.78f, 4.92f, 9.48f, 4.52f, 9.88f)
                lineTo(3f, 11.4f)
                curveTo(2.84f, 11.56f, 2.75f, 11.77f, 2.75f, 12f)
                curveTo(2.75f, 12.23f, 2.84f, 12.44f, 3f, 12.6f)
                lineTo(4.52f, 14.12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 16f)
                curveTo(14.44f, 16f, 13.99f, 15.55f, 13.99f, 15f)
                curveTo(13.99f, 14.45f, 14.44f, 14f, 14.99f, 14f)
                curveTo(15.54f, 14f, 15.99f, 14.45f, 15.99f, 15f)
                curveTo(15.99f, 15.55f, 15.55f, 16f, 15f, 16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.01f, 10f)
                curveTo(8.45f, 10f, 8f, 9.55f, 8f, 9f)
                curveTo(8f, 8.45f, 8.45f, 8f, 9f, 8f)
                curveTo(9.55f, 8f, 10f, 8.45f, 10f, 9f)
                curveTo(10f, 9.55f, 9.56f, 10f, 9.01f, 10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.999f, 15.75f)
                curveTo(8.809f, 15.75f, 8.619f, 15.68f, 8.469f, 15.53f)
                curveTo(8.179f, 15.24f, 8.179f, 14.76f, 8.469f, 14.47f)
                lineTo(14.469f, 8.47f)
                curveTo(14.759f, 8.18f, 15.24f, 8.18f, 15.53f, 8.47f)
                curveTo(15.819f, 8.76f, 15.819f, 9.24f, 15.53f, 9.53f)
                lineTo(9.529f, 15.53f)
                curveTo(9.379f, 15.68f, 9.189f, 15.75f, 8.999f, 15.75f)
                close()
            }
        }.build()

        return _DiscountShape!!
    }

@Suppress("ObjectPropertyName")
private var _DiscountShape: ImageVector? = null
